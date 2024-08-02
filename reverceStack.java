package minakshiApplication;

import java.util.Stack;

public class reverceStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<>();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println(st);
System.out.println("After reverse");
Stack<Integer> st1=new Stack<>();
while(st.size()>0) {
	st1.push(st.pop());
}
System.out.println(st1);
	}

}
