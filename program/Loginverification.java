package interview.program;

import java.util.Scanner;

public class Loginverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="Dhinesh";
		String password="adb123";
		System.out.println("--------Enter your name:---------");
		String a=sc.nextLine();
		System.out.println("--------Enter your password:--------");
		String b=sc.nextLine();
		if((a.equals(name))&& (b.equals(password))){
			System.out.println("-----Login Successfull-------");
		}
		else {
			System.out.println("please enter the valid username and password");
		}
	}

}
