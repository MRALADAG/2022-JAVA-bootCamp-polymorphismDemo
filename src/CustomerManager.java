import java.util.List;

public class CustomerManager {
    private Customer customer;
    private List<BaseLogger> loggers;

    public CustomerManager(Customer customer, List<BaseLogger> loggers) {
        this.customer = customer;
        this.loggers = loggers;
    }

    public void add() {
        System.out.println("Müşteri eklendi. \n" + customer.getCustomerInfo());
        for (BaseLogger logger : loggers) {
            logger.log(customer.getFirstName() + " " + customer.getLastName());
        }
    }
}
