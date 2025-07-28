package week3.day3;

class BankAccount{
	private double balance;
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	public double getBalance() {
		return balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		obj.deposit(2000.0);
		System.out.println(obj.getBalance());
	}

}
