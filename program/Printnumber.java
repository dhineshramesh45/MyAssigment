package interview.program;

import java.util.Scanner;

public class Printnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int a=n*2;
		for(int i=1;i<=a;i++) {
			if(i<=100) {
				System.out.println(i);
			}
			else {
				System.out.println(a-i+1);
			}
		}
	}
}
