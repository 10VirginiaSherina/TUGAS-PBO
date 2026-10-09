public class Customer {
    private String firstName;
    private String lastName;
    private Account acc;

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account acnt){
        this.acc = acnt;
    }

    public Account getAccount(){
        return acc;
    }
}
