package Array;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,5,3,6,4,7,9};
reverse(arr,0,arr.length-1);
for(int i =0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}

}
