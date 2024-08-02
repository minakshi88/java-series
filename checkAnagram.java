package minakshiApplication;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="silent", s2="ligsten";
          System.out.println(isAnagaram(s1,s2));

	}

	private static boolean isAnagaram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c1=s1.toCharArray();	
		Arrays.sort(c1);
		s1=new String(c1);
		char[] c2=s2.toCharArray();
		Arrays.sort(c2);;
		s2=new String(c2);
		return s1.equals(s2);
	}

}
