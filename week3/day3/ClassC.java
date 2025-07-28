package week3.day3;

public class ClassC extends ClassB{
	static int version=132;
	public static void main(String[]args) {
		ClassC obj=new ClassC();
		obj.loadUrl();
		obj.navigateback();
		System.out.println(ClassC.version);
	}
	
}
