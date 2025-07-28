package week3.day3;

import java.util.Scanner;

public class LearnFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=1;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the given number:");
		int n=a.nextInt();
		for(int i=1;i<=n;i++) {
			temp=temp*i;
		}
		System.out.println("Factorial of "+n+ " is "+temp);
		a.close();
		}
}
