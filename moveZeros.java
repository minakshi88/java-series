package Array;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,1,0,2,1,0,3};
moveZerosAtLast(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+ " ");
	}
}

	private static void moveZerosAtLast(int[] arr) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		
	}

}
