package minakshiApplication;

public class pallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="rohot";
System.out.println(isPallindrome(s));
	}

	private static boolean isPallindrome(String s) {
		int st=0;int end=s.length()-1;
		while(st<end) {
			if(s.charAt(st)!=s.charAt(end)) {
				return false;
			}
		     st++;
		     end--;
		}
		// TODO Auto-generated method stub
		return true;
	}

}
