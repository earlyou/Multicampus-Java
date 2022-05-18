package p722;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
