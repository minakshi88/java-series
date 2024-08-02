package minakshiApplication;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(s.substring(2));
		System.out.println(Reverse(s));
		System.out.print(s.substring(0));
		
	}
		public static String Reverse(String s) {
		if(s.length()==0)return "";
		if(s==null || s.length()<=1) {
			return s;
		}
		return Reverse(s.substring(1))+s.charAt(0);
	}

}
