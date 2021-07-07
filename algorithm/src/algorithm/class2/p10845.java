package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> q = new LinkedList<>();

		int a = Integer.parseInt(br.readLine());
		int back = 0;
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();

			if (s.equals("push")) {
				back = Integer.parseInt(st.nextToken());
				q.add(back);
			} else if (s.equals("pop")) {
				if (!q.isEmpty()) {
					System.out.println(q.poll());
				} else {
					System.out.println("-1");
				}
			} else if (s.equals("size")) {
				System.out.println(q.size());
			} else if (s.equals("empty")) {
				if (q.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (s.equals("front")) {
				if (!q.isEmpty()) {
					System.out.println(q.peek());
				} else {
					System.out.println("-1");
				}
			} else if(s.equals("back")) {
				if (!q.isEmpty()) {
					System.out.println(back);
				} else {
					System.out.println("-1");
				}
			}
		}
	}
}
