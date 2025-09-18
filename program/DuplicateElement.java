package interview.program;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,2,1,3,4,8,9};
		System.out.println("Duplicate elements in array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
				
			}
		}

	}

}
