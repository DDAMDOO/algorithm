package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p16928 {
	public static int[] ary = new int[101];
	public static int[] cnt = new int[101];
	public static boolean[] visited = new boolean[101];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = 0; i < a + b; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ary[k] = m;
		}

		bfs();
	}

	public static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		cnt[1] = 0;
		visited[1] = true;

		while(!q.isEmpty()) {
			int a = q.poll();

			if (a == 100) {
				System.out.println(cnt[a]);
				return;
			}

			for (int i = 1; i < 7; i++) {
				int x = a + i;
				if (x > 100) {
					continue;
				}

				if (visited[x] == true) {
					continue;
				}
				visited[x] = true;

				if (ary[x] > 0) {
					if (visited[ary[x]] == false) {
						q.add(ary[x]);
						visited[ary[x]] = true;
						cnt[ary[x]] = cnt[a] + 1;
					}
				} else {
					q.add(x);
					cnt[x] = cnt[a] + 1;
				}
			}
		}
	}
}