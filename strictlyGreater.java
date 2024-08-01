package Array;
import java.util.Scanner;
public class strictlyGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int[] arr= {3,4,5,7,3,6,7};
          System.out.println(strictgreat(arr,x));
 
	}
	public static int strictgreat(int[] arr, int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
	}

}
