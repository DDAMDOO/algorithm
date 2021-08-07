package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2606 {
	static int[][] ary;
	static boolean[] visited;
	static int a;
	static int b;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		ary = new int[a + 1][a + 1];
		visited = new boolean[a + 1];
		visited[1] = true;
		for (int i = 0; i < b; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			ary[x][y] = 1;
			ary[y][x] = 1;
		}
		bfs(1);
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		int cnt = 0;
		q.add(start);

		while (!q.isEmpty()) {
			int n = q.poll();
			for (int i = 1; i <= a; i++) {
				if (ary[n][i] == 1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}