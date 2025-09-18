package interview.program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int orgnum=num;
		int sum=0;
		int digits=String.valueOf(num).length();
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit, digits);
			num=num/10;
			}
		if(sum==orgnum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		sc.close();		

	}

}
