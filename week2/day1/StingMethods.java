package week2.day1;

public class StingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Test";
		String b="test";
		if(a.equals(b)){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		String n="I am a software Tester";
		String lowercase=n.toLowerCase();
		System.out.println(lowercase);    
		// like toUpperCase()-String method to convert into upper case
		String[] split=lowercase.split(" ");
		System.out.println(split[3]);
		
		for (String string : split) {
			System.out.print(string + " ");
		
	}
}
}
