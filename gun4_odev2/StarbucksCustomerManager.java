public class StarbucksCustomerManager extends CustomerManager {

    private final CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Starbucks customer validation achieved");
            super.save(customer);
        }
        else System.out.println(customer.getName() + " is not a valid person because his/her length of nationality id is not equal to 11");
    }

}
