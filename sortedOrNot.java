package Array;

public class sortedOrNot {
	public static void main(String[] args) {
		int arr[]= {4 ,6,32,6,2,7,8,5,46};
	System.out.println(Sorted(arr));
	}
	public static boolean Sorted(int[] arr) {
		boolean check =true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1])
				check=false;
			break;
		}
		return check;
		
	}

}
