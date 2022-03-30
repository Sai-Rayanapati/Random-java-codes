import java.util.ArrayList;
import java.util.Scanner;

public class BankCoustomer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private int customerDateOfBirth;

    public int getAccountNumber()
    {
        return accountNumber;
    }
    public int getCustomerDateOfBirth()
    {
        return customerDateOfBirth;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public String getCustomerAddress()
    {
        return customerAddress;
    }
    public void setAccountNumber(int aNumber)
    {
        accountNumber=aNumber;
    }
    public void setCustomerName(String cName)
    {
        customerName=cName;
    }
    public void setCustomerAddress(String cAddress)
    {
        customerAddress=cAddress.toLowerCase();
    }
    public void setCustomerDateOfBirth(int dob)
    {
        customerDateOfBirth=dob;
    }

    public static String findCustomer(int accNumber, BankCoustomer[] customers)
    {
        String custName=null;
        for(int i=0;i<customers.length;i++)
        {
            if (customers[i].accountNumber==accNumber)
            {
                custName = customers[i].customerName;
            }
        }
        return custName;
    }
    public static String findCustomer(int dob, String address, BankCoustomer[] customers)
    {
        String custName=null;
        for(int i=0;i<customers.length;i++)
        {
            if(customers[i].customerAddress == address)
            {
                custName = customers[i].customerName;
            }

        }
        return custName;
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        //BankCoustomer[] cust= new BankCoustomer[10];
        ArrayList<BankCoustomer>=

        for(int i=0;i<cust.length;i++)
            cust[i]=new BankCoustomer();

        System.out.println("Enter Account Number");
        cust[0].setAccountNumber(input.nextInt());
        System.out.println("Enter Customer name");
        cust[0].setCustomerName(input.next());
        System.out.println("Enter customer address");
        cust[0].setCustomerAddress(input.next());
        System.out.println("Enter customer date of birth");
        cust[0].setCustomerDateOfBirth(input.nextInt());
        System.out.println(cust[0].getAccountNumber());
        System.out.println(cust[0].getCustomerAddress());
        System.out.println(cust[0].getCustomerName());
        System.out.println(cust[0].customerDateOfBirth);

        System.out.println("Enter dob");
        int dob=input.nextInt();
        System.out.println("enter address");
        String address=input.next();
        System.out.println(findCustomer(dob,address.toLowerCase(),cust));
        System.out.println("enter ac no");
        int acno=input.nextInt();
        System.out.println(findCustomer(acno,cust));
    }
}
