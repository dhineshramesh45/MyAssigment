package week3.day3;
class Math{
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverLoading {
	public static void main(String[]args) {
		Math obj1=new Math();
		System.out.println(obj1.add(1,3));
		System.out.println(obj1.add(1,5,8));
		System.out.println(obj1.add(3.4,7.8));
		
	}

}
