package week1Day1;
import java.util.Scanner;

public class Calculator {
	public int add(int a,int b) {
		int n=a+b;
		return n;
	}
	public int sub(int a,int b) {
		int n=a-b;
		return n;
	}
	public int mul(int a,int b) {
		int n=a*b;
		return n;
	}
	public int div(int a,int b) {
		int  n=a/b;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ra=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=ra.nextInt();
		System.out.println("Enter the value of b:");
		int b=ra.nextInt();
		Calculator obj=new Calculator();
		int m=obj.add(a,b);
		int f=obj.sub(a,b);
		int e=obj.mul(a,b);
		int h=obj.div(a,b);
		System.out.println("-------------Calculator-------------");
		System.out.println("Value of "+a+"+"+b+"="+m);
		System.out.println("Value of "+a+"-"+b+"="+f);
		System.out.println("Value of "+a+"*"+b+"="+e);
		System.out.println("Value of "+a+"/"+b+"="+h);
		System.out.println("--------------------------------------");
		ra.close();
		
		

	}

}
