package project.Concrete;

import project.Abstract.CustomerCheckService;
import project.Entity.Customer;

public class SimpleCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = false;
		if((customer.getBirthYear() > 1900) && (Long.toString(customer.getTcNo()).length() == 11)) {
			result = true;
			System.out.println("Simple Do�rulama ba�ar�l�.");
			return result;
		}
		System.out.println("Simple Do�rulama ba�ar�s�z.");
		return result;
		
	}
}
