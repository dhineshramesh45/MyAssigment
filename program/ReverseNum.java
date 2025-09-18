package interview.program;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(num!=0) {
			int digit=num%10;
			sum=sum*10+digit;
			num=num/10;
			}
		System.out.println("Reverse of number:"+sum); 
		
//		to check the plaindrome number 
//		if(sum==temp) {
//			System.out.println("This is palindrome number");
//		}
//		else {
//			System.out.println("Not a palindrome number");
//		}
	}

}
