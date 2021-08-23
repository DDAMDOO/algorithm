package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1389 {
	public static int a;
	public static int b;
	public static int[][] rst;
	public static int[][] ary;
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		ary = new int[a + 1][a + 1];
		rst = new int[a + 1][a + 1];

		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			ary[x][y] = 1;
			ary[y][x] = 1;
		}

		int idx = 0;

		for (int i = 1; i <= a; i++) {
			visited = new boolean[a + 1];
			bfs(i);
		}
		int[] sum = new int[a + 1];
		sum[0] = Integer.MAX_VALUE;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				sum[i] += rst[i][j];
			}
			if (sum[0] > sum[i]) {
				sum[0] = sum[i];
				idx = i;
			}
		}

		System.out.println(idx);
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(start);

		while (!q.isEmpty()) {
			int n = q.poll();

			for (int i = 1; i <= a; i++) {
				if (visited[i] == false && ary[n][i] == 1) {
					q.add(i);
					rst[start][i] += rst[start][n] + 1;
					visited[i] = true;
				}
			}
		}
	}
}