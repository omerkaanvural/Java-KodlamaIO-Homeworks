public abstract class CustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to database : " + customer.getName());
    }
}
