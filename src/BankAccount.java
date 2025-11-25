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
        if(deposit < 0){
            System.out.println("Invalid amount, try again");
        }
        else{
            this.balance += deposit;
        }
    }
    public void withdraw(double withdraw){
        if(withdraw < 0 || withdraw > this.balance){
            System.out.println("Invalid amount, try again");
        }
        else{
            this.balance -= withdraw;
        }
    }
}
