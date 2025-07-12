package week1.day4;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=obj.nextLine();
		System.out.println("Enter your age:");
		int age=obj.nextInt();
		System.out.println("Enter your height");
		Double heg=obj.nextDouble();
		System.out.println("----------User Details------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Height:"+heg);
		obj.close();
	}
}
