package Array;

public class removeEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,6,4,8,5,6,43,54,1};
		int res[]=removeEvenNo(arr);
		for(int i=0;i<res.length;i++) {
		System.out.print(res[i] + " ");
		}
		
	}

	private static int[] removeEvenNo(int[] arr) {
		// TODO Auto-generated method stub
		int oddcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddcount++;
			}
		}
		int res[]=new int[oddcount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				res[idx]=arr[i];
				idx++;
			}
		}
		return res;
	}

}
