package Array;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,28,34,10,28,45};
		int res[]=removeDupli(arr);
		System.out.println(Arrays.toString(res));

	}

	private static int[] removeDupli(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		for(int ele:arr) {
			hs.add(ele);
		}
		//hashset convert to array
		int result[]=new int[hs.size()];
		int idx=0;
		for(int ele:hs) {
			result[idx++]=ele;
		}
		return result;
	}

}
