import java.util.ArrayList;
public class Bank{
    boolean duplicate;
    ArrayList <BankAccount> accounts = new ArrayList<>();

    public void addBankAccount(String newAccountName, double balance){
        duplicate = false;
        for(BankAccount account : accounts){
            if(newAccountName.equals(account.accountName)){
                duplicate = true;
                System.out.println("Bank account already exists, try again!");
                break;
            }
        }
        if(duplicate == false){
            BankAccount newAccount = new BankAccount(newAccountName, balance);
            accounts.add(newAccount); // Adds account to the arraylist at the bank
            System.out.printf("Your Bank account: %s has been created \n", newAccountName);
        }
    }
    public void addExistingAccount(BankAccount currentAccount){
        duplicate = false;
        for(BankAccount account : accounts){
            if(account.accountName.equals(currentAccount.accountName)){
                duplicate = true;
                System.out.println("Bank account already exists, try again!");
                break;
            }
        }
        if(duplicate == false){
            accounts.add(currentAccount);
            System.out.printf("Your Bank account: %s has been created \n", currentAccount.accountName);
        }
    }
    @Override
    public String toString(){
        String list = "";
        for(BankAccount account : accounts){
            list += account.toString() + "\n";
        }
        return list;
    }
}