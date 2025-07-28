package week2.day1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nEnter the given string:");
		Scanner name=new Scanner(System.in);
		String a=name.nextLine();
		for(int j=a.length()-1;j>=0;j--) {
			System.out.print(a.charAt(j));
			}
		System.out.println();
		name.close();
		}
	}
// other way to reverse the string by using toCharrArray(0
//String na="Dhinesh";
//char[] rev=na.toCharArray();
//for(int i=rev.length-1;i>=0;i--) {
//	char c=rev[i];
//	System.out.print(c);
//}
			
			
		
		
			
	
