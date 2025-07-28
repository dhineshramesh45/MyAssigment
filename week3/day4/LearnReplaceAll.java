package week3.day4;

public class LearnReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="$4568.89";
		s=s.replaceAll("[^0-9]","");
		
		
		Integer.parseInt(s.replaceAll("[^0-9]",""));
		String[] split=s.split("\\.");
		System.out.println(split[0].replaceAll("[^0-9]",""));
		
	}

}
