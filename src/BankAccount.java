public class BankAccount {
   String accountName;
   private double balance;
   private static int id = 1;
   private int accountId;

    public BankAccount(String accountName, double balance){
        this.accountName = accountName;
        this.accountId = id;
        id++;
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
    public void transfer(BankAccount trans, double amount){
        if(amount < 0 || amount > this.balance){
            System.out.println("Invalid amount!");
        }
        else{
            this.balance -= amount;
            trans.balance += amount;
            System.out.printf("You transferred €%.2f to %s\n", amount, trans.accountName);
        }
    }
    @Override
    public String toString(){
        return "ID: " + accountId + ", Account Name: " + accountName + ", Balance: €" + balance;
    }
}
