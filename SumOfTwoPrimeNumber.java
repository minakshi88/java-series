package minakshiApplication;

public class SumOfTwoPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=34;
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(isPrime(i)) {
				if(isPrime(n-i)) {
					System.out.println(i + "+" + (n-i) +"=" +n);
					flag=true;
					
				}
			}
		}
		if(!flag) {
			System.out.println(n);
		}

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean temp=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				temp=false;
				break;
			}
		}
		return temp;
	}

}
