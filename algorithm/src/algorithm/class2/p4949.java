package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		for (;;) {
			s = br.readLine();
			if (s.equals(".")) {
				break;
			}
			sb.append(func(s) + "\n");
		}
		System.out.println(sb);
	}
	
	public static String func(String s) {
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (st.empty() || st.peek() != '(' ) {
					return "no";
				} else {
					st.pop();
				}
			} else if (s.charAt(i) == ']') {
				if (st.empty() ||st.peek() != '[') {
					return "no";
				} else {
					st.pop();
				}
			}
		}
		if (st.empty()) {
			return "yes";			
		} else {
			return "no";
		}
	}
}