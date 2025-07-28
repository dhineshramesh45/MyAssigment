package week3.day3;
abstract class ATM {
    // Abstract method (no body)
    abstract void withdraw(double amount);

    abstract void checkBalance();

    // Concrete method (can have body)
    public void insertCard() {
        System.out.println("Card Inserted. Please enter PIN.");
    }
}
class SBIATM extends ATM {
    private double balance = 5000;

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Available Balance: ₹" + balance);
    }
}

public class Abstraction{
    public static void main(String[] args) {
        ATM myATM = new SBIATM();  // Reference of abstract class, object of child class

        myATM.insertCard();        // Concrete method
        myATM.withdraw(1000);      // Overridden method
        myATM.checkBalance();      // Overridden method
    }
}
