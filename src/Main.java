import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*EmailLogger logger = new EmailLogger();
        logger.log("Log mesajı");*/

        List<BaseLogger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new EmailLogger());
        loggers.add(new FileLogger());

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Engin");
        customer.setLastName("DEMİROĞ");
        customer.setCustomerNumber("6216");
        customer.setIdentityNumber("455456216");
        customer.setPhone("05452586931");

        CustomerManager customerManager = new CustomerManager(customer, loggers);
        customerManager.add();
    }
}
