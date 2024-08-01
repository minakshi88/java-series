package Array;

import java.util.Arrays;

public class addElement {
public static void main(String[] args) {
	int arr[]= {4,6,23,10,1,3};
	Arrays.sort(arr);
	System.out.println();
	int l=arr[arr.length-1];
	System.out.println(l);
	int sum=0;
	for(int i=0;i<arr.length-1;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
