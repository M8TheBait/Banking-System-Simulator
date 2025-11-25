public class Main {
    public static void main(String[] args){
        /*
    Design and implement Java classes to represent bank accounts and transactions.
    Utilize constructors and methods to initialize and manipulate account data.
    Implement encapsulation to protect sensitive data.
    Use Java’s built-in classes to manage collections of accounts and transactions.
    Create a custom toString() method for informative output of account details.
         */

        BankAccount first = new BankAccount("Oskar Andersson", 1500);
        System.out.println(first.balance);
        first.deposit(500);
        System.out.println(first.balance);

        first.withdraw(250);
        System.out.println(first.balance);
    }
}
