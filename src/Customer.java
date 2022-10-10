public class Customer {
    private int id;
    private String customerNumber;
    private String firstName;
    private String lastName;
    private String phone;
    private String identityNumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getCustomerInfo() {
        return "id : " + id + ", Customer name : " + firstName + " " + lastName +
                ", Nationality number : " + identityNumber + ", phone number : " +
                phone + ", customerId : " + customerNumber;
    }
}
