package gun5_odev1.business.abstracts;

import gun5_odev1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
}
