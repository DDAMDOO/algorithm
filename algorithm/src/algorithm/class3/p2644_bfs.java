package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2644_bfs {
	public static int[][] ary;
	public static boolean[] visited;
	public static int[] rst;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		int line = Integer.parseInt(br.readLine());
		ary = new int[a + 1][a + 1];

		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			ary[x][y] = 1;
			ary[y][x] = 1;
		}
		rst = new int[a + 1];
		visited = new boolean[a + 1];
		System.out.println(rst[end]);
		bfs(start, end, a);
	}

	public static void bfs(int start, int end, int a) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			int s = q.poll();
			if (s == end) {
				return;
			}
			for (int i = 1; i <= a; i++) {
				if (visited[i] == false && ary[s][i] == 1) {
					visited[i] = true;
					rst[i] = rst[s] + 1;
					q.add(i);
				}
			}
		}
		rst[end] = -1;
	}
}