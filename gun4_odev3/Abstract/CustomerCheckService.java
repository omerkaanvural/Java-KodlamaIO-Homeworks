package project.Abstract;

import project.Entity.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
