package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int sum = 0;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < a; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				st.pop();
			} else {
				st.push(n);
			}
		}
		while (!st.isEmpty()) {
			sum += st.pop();
		}
		System.out.println(sum);
	}
}