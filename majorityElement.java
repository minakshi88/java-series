package minakshiApplication;

import java.util.*;

public class majorityElement {

	public static void majority(int num[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int n =num.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			}
			else {
				map.put(num[i], 1);
			}
			
		}
		for(int key:map.keySet()) {
			if(map.get(key)>n/3) {
				System.out.println(key);
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,3,2,4,5,3,4,2,4,1,1,4,1,2};
		majority(num);

	}

}
