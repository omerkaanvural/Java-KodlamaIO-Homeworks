package gun5_odev1.dataAccess.concretes;

import java.util.List;

import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.entities.concretes.User;

// data access 
public class HibernateUserDao  implements UserDao {

	@Override
	public boolean checkIfUserInDb(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
