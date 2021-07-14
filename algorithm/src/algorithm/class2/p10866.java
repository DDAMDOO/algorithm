package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class p10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> dq = new ArrayDeque<>();

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String[] s = br.readLine().split(" ");
			if (s[0].equals("push_front")) {
				dq.addFirst(s[1]);
			} else if (s[0].equals("push_back")) {
				dq.addLast(s[1]);
			} else if (s[0].equals("pop_front")) {
				if (dq.size() != 0) {
					System.out.println(dq.peekFirst());
					dq.pollFirst();
				} else {
					System.out.println("-1");
				}
			} else if (s[0].equals("pop_back")) {
				if (dq.size() != 0) {
					System.out.println(dq.peekLast());
					dq.pollLast();
				} else {
					System.out.println("-1");
				}
			} else if (s[0].equals("size")) {
				System.out.println(dq.size());
			} else if (s[0].equals("empty")) {
				if (dq.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (s[0].equals("front")) {
				if (dq.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(dq.peekFirst());
				}
			} else if (s[0].equals("back")) {
				if (dq.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(dq.peekLast());
				}
			}
		}
	}
}