package interview.program;

import java.util.Scanner;

public class FinonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int first=0,second=1;
		System.out.println("fibonacci seris upto"+n+"terms:");
		for(int i=1;i<=n;i++) {
			System.out.println(first+" ");
			int next=first+second;
			first=second;
			second=next;
			}
		}

}
