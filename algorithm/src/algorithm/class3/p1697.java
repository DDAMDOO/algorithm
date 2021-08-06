package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1697 {
	static int[] ary = new int[100001];
	static int b;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		if (a == b) {
			System.out.println(0);
		} else {
			jump(a);
			System.out.println(ary[b]);
		}
	}

	public static void jump(int a) {
		ary[a] = 1;

		Queue<Integer> q = new LinkedList<>();
		q.add(a);

		while (!q.isEmpty()) {
			int idx = q.poll();

			for (int i = 0; i < 3; i++) {
				int j = 0;
				if (i == 0) {
					j = idx + 1;
				} else if (i == 1) {
					j = idx - 1;
				} else {
					j = idx * 2;
				}
				if (j == b) {
					ary[j] = ary[idx];
					return;
				}
				if (j >= 0 && j < ary.length && ary[j] == 0) {
					q.add(j);
					ary[j] = ary[idx] + 1;
				}
			}
		}
	}

}
