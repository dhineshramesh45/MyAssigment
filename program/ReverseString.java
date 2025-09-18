package interview.program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given String:");
		String Str=sc.nextLine();
		String rev=" ";
		for(int i=Str.length()-1;i>=0;i--) {
			rev=rev+Str.charAt(i);
		}
		System.out.println("Reverse of String:"+rev);
		sc.close();

	}

}
