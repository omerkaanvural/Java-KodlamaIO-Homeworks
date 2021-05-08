package gun5_odev1;

import java.util.Scanner;

import gun5_odev1.business.concretes.EmailAuthentication;
import gun5_odev1.business.concretes.UserManager;
import gun5_odev1.core.GoogleLoginManagerAdapter;
import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.dataAccess.concretes.CustomUserDao;
import gun5_odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		// initialize userDao first because all new users will be registered same database (assume)
		UserDao userDao1 = new CustomUserDao();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kayýt olup giriþ yapmak için 1, Google ile direkt giriþ için 2 yazýnýz : ");
		String command = sc.nextLine();
		
		if(command.equals("1")) {
			
			String name;
			String surname;
			String email;
			String password;
			User user;
			
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Adýnýz : ");
			name = sc2.nextLine();
			System.out.print("Soyadýnýz : ");
			surname = sc2.nextLine();
			System.out.print("Email : ");
			email = sc2.nextLine();
			System.out.print("Parola : ");
			password = sc2.nextLine();
			sc2.close();
			
			user = new User(name, surname, email, password);
			
			UserManager userManager = new UserManager(userDao1, new EmailAuthentication());
			userManager.register(user);
			
			userManager.login("kaan.vural99@hotmail.com", "asdqwe123");
			userDao1.delete(user);
			userDao1.update(user);
			
			sc.close();
		}
		
		else if(command.equals("2")) {
			UserManager userManager = new UserManager(userDao1, new GoogleLoginManagerAdapter());
			String email;
			String password;
			
			Scanner sc3 = new Scanner(System.in);
			System.out.print("Email : ");
			email = sc3.nextLine();
			System.out.print("Parola : ");
			password = sc3.nextLine();
			sc3.close();
			
			userManager.loginWithGoogle(email, password);
			
			sc.close();
		}
		
		
		else System.out.println("Geçersiz komut.");
		
		
	}

}
