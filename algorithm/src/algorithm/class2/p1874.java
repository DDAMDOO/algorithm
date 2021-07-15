package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int start = 0;
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < a; i++) {
			int n = Integer.parseInt(br.readLine());

			if (start < n) {
				for (int j = start+1; j <= n; j++) {
					sb.append("+\n");
					st.push(j);
				}
				start = n;
			} else if (st.peek() != n) {
				System.out.println("NO");
				return;
			}
			sb.append("-\n");
			st.pop();
		}
		System.out.println(sb);
	}
}