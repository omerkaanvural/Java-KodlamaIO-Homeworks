package gun5_odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun5_odev1.dataAccess.abstracts.UserDao;
import gun5_odev1.entities.concretes.User;

public class CustomUserDao implements UserDao{
	private ArrayList<User> users;

	public CustomUserDao() {
		users = new ArrayList<User>();
	}
	
	public boolean checkIfUserInDb(User user) {
		if(users.contains(user)) {
			return true;
		}
		return false;
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kayd�n�z tamamland� : " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
		System.out.println("Kullan�c� silindi : " + user.getName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		if(users.contains(user)) {
			System.out.println("Kullan�c� g�ncellendi : " + user.getName());
		}
		else System.out.println("G�ncellenmesi istenen kullan�c� sistemde bulunmuyor.");
		
	}

	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return users;
	}
}
