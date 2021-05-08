package gun5_odev1.business.concretes;

import gun5_odev1.business.abstracts.AuthenticationService;
import gun5_odev1.entities.concretes.User;

public class EmailAuthentication implements AuthenticationService{

	@Override
	public void send(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() + " adresine do�rulama linki g�nderilmi�tir. Bu linkten kayd�n�z� onaylad�ktan sonra giri� yapabilirsiniz.");
	}

}
