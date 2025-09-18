package interview.program;

public class ReplaceCharacterprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Dhanesh";
		String[] Str1=Str.split("");
		String emptstr="";
		Str1[2]="i";
		for(int i=0;i<=Str1.length-1;i++) {
			emptstr=emptstr+Str1[i];
			}
			System.out.println(emptstr);
		}

}
