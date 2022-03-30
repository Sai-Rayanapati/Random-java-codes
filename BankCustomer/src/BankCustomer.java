

public class BankCustomer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private int customerDateOfBirth;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setAccountNumber(int acNumber) {
        accountNumber = acNumber;
    }

    public void setCustomerName(String cName) {
        customerName = cName;
    }

    public void setCustomerAddress(String cAddress) {
        customerAddress = cAddress;
    }

    public void setCustomerDateOfBirth(int cDOB) {
        customerDateOfBirth = cDOB;
    }

    public static void main(String[] args)
    {
        BankCustomer customer1= new BankCustomer();

        customer1.setAccountNumber(1);
        customer1.setCustomerAddress("idk");
        customer1.setCustomerName("omg");
        customer1.setCustomerDateOfBirth(12122001);

        System.out.println(customer1.getAccountNumber());

    }
}

