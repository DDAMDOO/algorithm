package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Queue<Integer> q = new LinkedList<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= a; i++) {
			q.add(i);
		}

		int i = 1;
		sb.append("<");
		while (q.size()>1) {
			if (i % b == 0) {
				sb.append(q.peek() + ", ");
				q.poll();
			} else {
				q.add(q.peek());
				q.poll();
			}
			i++;
		}
		sb.append(q.poll() + ">");
		System.out.println(sb);
	}
}