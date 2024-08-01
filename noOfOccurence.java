package Array;
import java.util.Scanner;
public class noOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	
		int[] arr= {3,4,5,4,5,6};
		int x=sc.nextInt();
		System.out.println(Occurence(arr,x));
		System.out.println(lastOccurence(arr,x));

	}
	
	//idr pe all occurence h mtlb hjitne v ayye honge sabhi h 
public static int Occurence(int[] arr, int x) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			count++;
		}
	}
	return count;
}

// idr p only jo akhiri wale k index hoga whi return krega
public static int lastOccurence(int[] arr, int x) {
	int lastIndex=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			lastIndex=i;
		}
	}
	return lastIndex;
}
}
