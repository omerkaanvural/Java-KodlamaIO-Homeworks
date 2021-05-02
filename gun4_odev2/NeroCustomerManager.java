public class NeroCustomerManager extends CustomerManager{

    @Override
    public void save(Customer customer) {
        System.out.println(customer.getName() + " is saved to database for Nero");
    }
}
