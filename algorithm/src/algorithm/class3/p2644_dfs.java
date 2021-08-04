package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2644_dfs {
	public static int a;
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		a = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		int line = Integer.parseInt(br.readLine());

		int[][] ary = new int[a + 1][a + 1];

		for (int i = 1; i <= line; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			ary[x][y] = 1;
			ary[y][x] = 1;
		}
		boolean[] visited = new boolean[a + 1];
		dfs(ary, visited, start, end, cnt);
		System.out.println(cnt);
	}

	public static void dfs(int[][] ary, boolean[] visited, int start, int end, int depth) {
		visited[start] = true;
		for (int i = 0; i < a; i++) {
			if (start == end) {
				cnt = depth;
				return;
			}

			if (visited[i] == false && ary[start][i] == 1) {
				visited[i] = true;
				dfs(ary, visited, i, end, depth + 1);
			}
		}
	}
}