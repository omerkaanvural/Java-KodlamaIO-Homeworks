public class CustomerCheckManager implements CustomerCheckService{
    // custom check service
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        // assuming
        return true;
    }
}
