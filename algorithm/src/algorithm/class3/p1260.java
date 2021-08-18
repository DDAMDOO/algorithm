package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1260 {
	public static int a;
	public static int b;
	public static int[][] ary;
	public static boolean[] visitedBfs;
	public static boolean[] visitedDfs;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		ary = new int[a + 1][a + 1];
		visitedBfs = new boolean[a + 1];
		visitedDfs = new boolean[a + 1];

		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			ary[j][k] = 1;
			ary[k][j] = 1;
		}

		dfs(s);
		System.out.println();
		bfs(s);
	}

	public static void bfs(int s) {
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visitedBfs[s] = true;
		System.out.print(s + " ");
		while (!q.isEmpty()) {
			int n = q.poll();

			for (int i = 1; i <= a; i++) {
				if (ary[n][i] == 1 && visitedBfs[i] == false) {
					q.add(i);
					visitedBfs[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void dfs(int s) {
		if (visitedDfs[s] == true) {
			return;
		}

		visitedDfs[s] = true;
		System.out.print(s + " ");

		for (int i = 1; i <= a; i++) {
			if (ary[s][i] == 1 && visitedDfs[i] == false) {
				dfs(i);
			}
		}
	}
}