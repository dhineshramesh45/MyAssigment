package interview.program;

import java.util.Scanner;

public class Atmprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acc_balance=10000;
		int acc_pin=417;
		System.out.println("-----------Welcome Dhinesh-----------------");	
		System.out.println("Witdrawal/Enquiry");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		if(a.equalsIgnoreCase("Enquiry")) {
			System.out.println("Enter your pin:");
			int pin=sc.nextInt();
			if(acc_pin==pin) {
				System.out.println("Accountbalance:"+acc_balance);
			}
			else {
				System.out.println("please enter the valid pin");
			}
		}
		else if(a.equalsIgnoreCase("Withdrawal")) {
			System.out.println("Enter your pin:");
			int pin=sc.nextInt();
			if(acc_pin==pin) {
				System.out.println("How much amount to withdrawl");
				int wt=sc.nextInt();
				acc_balance-=wt; //acc_balance=acc_balance-wt
				if(wt<=acc_balance) {
					System.out.println("Remainning balance:"+acc_balance);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else {
					System.out.println("please enter valid pin");
				
			}
		}
		else {
			System.out.println("Invalid option! Please enter Enquiry or Withdrawal");
		}
		sc.close();
	}
}
