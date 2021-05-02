public class MernisCheckManager implements CustomerCheckService{

    // I could not use real mernis system because java web services needs java EE.
    // I have no Tools/Web Services.

    // assume mernis check service
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalityId().length() == 11;
    }
}
