package Array;

public class findSecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,4,3,78,5,33};
		System.out.println(findMax(arr));
		System.out.println(findSecondMax(arr));

			}
			public static int findSecondMax(int[] arr) {
				int max=findMax(arr);
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==max) {
						arr[i]=Integer.MAX_VALUE;
					}
				}
				int secondMax=findMax(arr);
				return secondMax;
			}
			public static int findMax(int[] arr) {
				int max=Integer.MAX_VALUE;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]<max) {
						max=arr[i];
					}
				}
				return max;
	}

}
