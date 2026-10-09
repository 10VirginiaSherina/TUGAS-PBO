import java.util.ArrayList;

public class MyBank {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Account acc1 = new Account(100000);
        Customer cust1 = new Customer("Virginia", "Sherina");
        cust1.setAccount(acc1);
        customers.add(cust1);

        Account acc2 = new Account(200000);
        Customer cust2 = new Customer("Rico", "Hasudungan");
        cust2.setAccount(acc2);
        customers.add(cust2);

        Account acc3 = new Account(50000);
        Customer cust3 = new Customer("Ninung", "Jayajaya");
        cust3.setAccount(acc3);
        customers.add(cust3);
        customers.get(2).getAccount().withdraw(25000);
     
        System.out.println("Welcome to MyBank");

        for (Customer cust : customers){
            System.out.println("Name: " + cust.getFirstName() + " " + cust.getLastName());

            System.out.println("Balance " + cust.getAccount().getBalance());

            System.out.println();
        }
    }
}
