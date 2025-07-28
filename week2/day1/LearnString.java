package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Dhinesh";
		int count=a.length();
		System.out.println(count);
		for(int i=0;i<a.length();i++) {
			System.out.print(a.charAt(i));
		}
		char[] chararray=a.toCharArray();
		System.out.println(chararray);
		for(int i=chararray.length-1;i>=0;i--) {
			char c=chararray[i];
			System.out.print(c);
		}
			
		}

	}

