package gun5_odev1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5_odev1.business.abstracts.AuthenticationService;
import gun5_odev1.business.abstracts.UserService;
import gun5_odev1.core.LoginService;
import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthenticationService authenticationService;
	private LoginService loginService;
	
	
	public UserManager(UserDao userDao, AuthenticationService authenticationService) {
		this.userDao = userDao;
		this.authenticationService = authenticationService;
	}
	
	// 2nd constructor for direct external login without any authentication
	public UserManager(UserDao userDao, LoginService loginService) {
		this.userDao = userDao;
		this.loginService = loginService;
	}

	@Override
	public void register(User user) {
		
		if(user.getPassword().length() > 6
		&& checkEmail(user)
		&& !userDao.checkIfUserInDb(user)
		&& user.getName().length() > 2
		&& user.getSurname().length() > 2) 
		{	
			authenticationService.send(user);
			// simulation
			System.out.println("Mailinize gelen linki onayladýnýz");
			userDao.add(user);
			
		}
		
		else {
			System.out.println("Kayýt tamamlanamadý.");
			System.out.println("Lütfen : \n"
					+ "1) Adýnýz ve soyadýnýzýn uzunluðunun 2 karakterden daha uzun olduðundan\n"
					+ "2) Daha önce ayný e-maille kayýt olmadýðýnýzdan\n"
					+ "3) E-mail formatýný düzgün yazdýðýnýzdan\n"
					+ "4) Parolanýzýn uzunluðunun 6 karakterden daha uzun olduðundan\n"
					+ "emin olunuz.");
		}
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		for(User user : userDao.get()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Giriþ yapýldý. (login çalýþtý.)");
			}		
			else System.out.println("Email veya parola hatalý. (login çalýþtý.)");
		}
	}
	
	public void loginWithGoogle(String email, String password) {
		loginService.loginExternal(email, password);
		User user = new User("default", "default", email, password);
		userDao.add(user);
	}
	
	
	public boolean checkEmail(User user) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(matcher.matches()) {
			return true;
		}
		return false;
	}

}
