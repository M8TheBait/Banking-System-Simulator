public class BankAccount {
    String accountName;
    double balance;

    public BankAccount(String accountName, double balance){
        this.accountName = accountName;
        if(balance < 0) {
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
    }
    public void deposit(double deposit){
        this.balance += deposit;
    }
}
