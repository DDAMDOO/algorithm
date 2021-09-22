package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2468 {
	public static int[][] ary;
	public static boolean[][] visited;
	public static int a;
	public static int cnt = 0;
	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, -1, 1, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		ary = new int[a + 1][a + 1];
		visited = new boolean[a + 1][a + 1];

		for (int i = 1; i <= a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
				if (max < ary[i][j]) {
					max = ary[i][j];
				}
			}
		}

		int rst = 0;
		for (int k = 0; k <= max; k++) {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= a; j++) {
					if (visited[i][j] == false && ary[i][j] > k) {
						dfs(i, j, k);
						cnt++;
					}
				}
			}
			rst = Math.max(cnt, rst);
			cnt = 0;
			init();
		}

		System.out.println(rst);
	}

	public static void dfs(int x, int y, int depth) {
		if (ary[x][y] <= depth || visited[x][y] == true) {
			visited[x][y] = true;
			return;
		}

		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int dx = x + nx[i];
			int dy = y + ny[i];
			if (dx > 0 && dy > 0 && dx <= a && dy <= a) {
				if (visited[dx][dy] == false) {
					dfs(dx, dy, depth);
				}
			}
		}
	}

	public static void init() {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				visited[i][j] = false;
			}
		}
	}
}