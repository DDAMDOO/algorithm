package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11403 {
	public static int a;
	public static int[][] ary;
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		ary = new int[a + 1][a + 1];

		for (int i = 1; i <= a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 1; i <= a; i++) {
			visited = new boolean[a + 1];

			for (int j = 1; j <= a; j++) {
				if (visited[j] == false && ary[i][j] == 1) {
					bfs(i, j);
				}
			}
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void bfs(int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		q.add(end);

		while (!q.isEmpty()) {
			int n = q.poll();

			for (int i = 1; i <= a; i++) {
				if (visited[i] == false && ary[n][i] == 1) {
					q.add(i);
					visited[i] = true;
					ary[start][i] = 1;
				}
			}
		}
	}
}