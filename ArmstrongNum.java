package minakshiApplication;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=153;
System.out.println(isArmstrong(a));
	}

	private static boolean isArmstrong(int a) {
		// TODO Auto-generated method stub
		int digit=0;
		int res=0;
		int temp=a;
		while(temp!=0) {
			temp/=10;
			++digit;
		}
		temp=a;
		while(temp!=0) {
			int rem=temp%10;
			res+=Math.pow(rem, digit);
			temp/=10;
		}
		if(res==a) {
			return true;
		}
		return false;
	}

}
