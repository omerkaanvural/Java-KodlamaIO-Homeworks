package gun5_odev1.core;

import gun5_odev1.GoogleAccess.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements LoginService{
	@Override
	public void loginExternal(String email, String password) {
		// TODO Auto-generated method stub
		GoogleLoginManager glmanager = new GoogleLoginManager();
		glmanager.login(email, password);
		
	}
}
