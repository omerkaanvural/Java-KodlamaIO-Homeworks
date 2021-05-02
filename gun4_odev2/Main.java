import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CustomerManager neroCustomerManager = new NeroCustomerManager();

        // if we want to use both check managers, simply we send an array as parameter.
        CustomerManager starbucksCustomManager = new StarbucksCustomerManager(new CustomerCheckManager());
        CustomerManager starbucksCustomManager2 = new StarbucksCustomerManager(new MernisCheckManager());

        Customer customer = new Customer("kaan", "vural", new Date(1999, Calendar.SEPTEMBER, 23), "12345678901");
        Customer customer2 = new Customer("engin", "demirog", new Date(1986, Calendar.JANUARY, 1), "1234567892");

        System.out.println("TRIAL 1");
        neroCustomerManager.save(customer);
        neroCustomerManager.save(customer2);

        System.out.println("TRIAL 2");
        starbucksCustomManager.save(customer);
        starbucksCustomManager.save(customer2);

        System.out.println("TRIAL 3");
        starbucksCustomManager2.save(customer);
        starbucksCustomManager2.save(customer2);


    }
}
