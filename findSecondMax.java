package Array;

public class findSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,6,4,78,5,33};
System.out.println(findSecondMaximum(arr));
System.out.println(findMax(arr));
System.out.println(findSecondMax(arr));
System.out.println(findSecondMaximum(arr));

	}
	// first method
	public static int findSecondMaximum(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secondmx=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmx=max;
				max=arr[i];
			}
			else if(arr[i]>secondmx && arr[i]!=max) {
				secondmx=arr[i];
			}
		}
		return secondmx;
	}
	// second method
	public static int findSecondMax(int[] arr) {
		int max=findMax(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secondMax=findMax(arr);
		return secondMax;
	}
	public static int findMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
