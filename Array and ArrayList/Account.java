public class Account {
    private double balance;

    public Account (double init_balance){
        balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amnt){
        balance = balance + amnt;
    }

    public void withdraw(double amnt){
        balance = balance - amnt;
    }
}
