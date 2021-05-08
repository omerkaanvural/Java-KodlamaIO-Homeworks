package gun5_odev1.business.concretes;

import gun5_odev1.business.abstracts.AuthenticationService;
import gun5_odev1.entities.concretes.User;

public class EmailAuthentication implements AuthenticationService{

	@Override
	public void send(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() + " adresine doğrulama linki gönderilmiştir. Bu linkten kaydınızı onayladıktan sonra giriş yapabilirsiniz.");
	}

}
