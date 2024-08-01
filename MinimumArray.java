package Array;

public class MinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,8,5,7,2,7,1};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
System.out.print(min);
	}

}
