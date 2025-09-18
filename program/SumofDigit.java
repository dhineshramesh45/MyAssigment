package interview.program;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=556;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the sum of digit:");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;  //rem=556%10=6
			sum=sum+rem;  //sum=0+6=6  
			num=num/10;
			}
		System.out.println(sum);
		}

}
