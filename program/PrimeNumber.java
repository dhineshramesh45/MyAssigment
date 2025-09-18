package interview.program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int num=sc.nextInt();
		boolean isprime=true;
		if(num<=1) {
			isprime=false;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isprime=false;
				}
			}
			if(isprime) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("It is not a prime number");
			}
		}

	}

}
