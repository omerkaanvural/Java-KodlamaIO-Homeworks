package project.Concrete;

import project.Abstract.CustomerCheckService;
import project.Entity.Customer;

public class CustomerManager {
	private final CustomerCheckService customerCheckService;
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getName() + " sisteme kaydedildi.");
		}
		else System.out.println(customer.getName() + " kaydý baþarýsýz.");
		
	}
}
