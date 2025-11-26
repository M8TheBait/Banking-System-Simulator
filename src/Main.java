public class Main {
    public static void main(String[] args){
        /*
    Design and implement Java classes to represent bank accounts and transactions.
    Utilize constructors and methods to initialize and manipulate account data.
    Implement encapsulation to protect sensitive data.
    Use Java’s built-in classes to manage collections of accounts and transactions.
    Create a custom toString() method for informative output of account details.
         */

        BankAccount first = new BankAccount("Lilly Potter", 1000);
        BankAccount second = new BankAccount("Draco Malfoy", 3000);
        Bank handelsbanken = new Bank();

        handelsbanken.addBankAccount("Cedric Diggory", 5000);
        handelsbanken.addExistingAccount(first);
        handelsbanken.addExistingAccount(second);

        System.out.println("\n" + handelsbanken.toString());

    }
}
