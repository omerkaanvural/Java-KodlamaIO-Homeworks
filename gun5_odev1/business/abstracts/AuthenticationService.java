package gun5_odev1.business.abstracts;
import gun5_odev1.entities.concretes.User;

public interface AuthenticationService {
	void send(User user);
}
