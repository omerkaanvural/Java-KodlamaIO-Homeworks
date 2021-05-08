package gun5_odev1.dataAccess.abstracts;

import java.util.List;

import gun5_odev1.entities.concretes.User;

public interface UserDao {
	boolean checkIfUserInDb(User user);
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> get();
}
