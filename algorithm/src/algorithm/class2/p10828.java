package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Integer> stack = new Stack<>();

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();

			if (s.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if (s.equals("pop")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println("-1");
				}
			} else if (s.equals("size")) {
				System.out.println(stack.size());
			} else if (s.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (s.equals("top")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println("-1");
				}
			}
		}
	}

}
