package Array;

import java.util.Arrays;

public class addElementArray {

	public static void main(String[] args) {
		int[] arr= {4,6,23,10,1,3};
	System.out.println(addElement(arr));

	}
	public static boolean addElement(int []arr) {
		Arrays.sort(arr);
		int l=arr[arr.length-1];
		int sum=0;
		for(int i=0;i<arr.length-2;i++) {
			sum+=arr[i];
		}if(sum!=l) {
			return false;
		}
		return true;
	}
	

}
