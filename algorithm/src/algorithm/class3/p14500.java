package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14500 {
	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, -1, 1, 0 };
	public static boolean[][] visited;
	public static int[][] ary;
	public static int a;
	public static int b;
	public static int rst = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		ary = new int[a][b];
		visited = new boolean[a][b];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < b; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				visited[i][j] = true;
				dfs(i, j, 0, 0);
				visited[i][j] = false;
				plus(i, j);
			}
		}
		System.out.println(rst);
	}

	public static void dfs(int x, int y, int depth, int cnt) {
		if (depth == 4) {
			rst = Math.max(cnt, rst);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int X = x + nx[i];
			int Y = y + ny[i];

			if (X >= 0 && Y >= 0 && X < a && Y < b) {
				if (visited[X][Y] == false) {
					visited[X][Y] = true;
					dfs(X, Y, depth + 1, cnt + ary[X][Y]);
					visited[X][Y] = false;
				}
			}
		}
	}

	public static void otherCase(int x, int y) {
		if (x + 2 < a && y + 1 < b && x >= 0 && y >= 0) {// た
			rst = Math.max(rst, ary[x][y] + ary[x + 1][y] + ary[x + 1][y + 1] + ary[x + 2][y]);
		}

		if (x + 2 < a && y - 1 >= 0 && x >= 0 && y < b) {// っ
			rst = Math.max(rst, ary[x][y] + ary[x + 1][y] + ary[x + 1][y - 1] + ary[x + 2][y]);
		}

		if (x - 1 >= 0 && y + 2 < b && x < a && y >= 0) {// で
			rst = Math.max(rst, ary[x][y] + ary[x][y + 1] + ary[x - 1][y + 1] + ary[x][y + 2]);
		}

		if (x + 1 < a && y + 2 < b && x >= 0 && y >= 0) {// ぬ
			rst = Math.max(rst, ary[x][y] + ary[x][y + 1] + ary[x + 1][y + 1] + ary[x][y + 2]);
		}
	}

	public static void plus(int x, int y) {
		int sum = ary[x][y];
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			int X = x + nx[i];
			int Y = y + ny[i];

			if (X >= 0 && Y >= 0 && X < a && Y < b) {
				min = Math.min(min, ary[X][Y]);
				sum += ary[X][Y];
				cnt++;
			}
		}
		if (cnt >= 3) {
			if (cnt == 4) {
				sum -= min;
			}
			rst = Math.max(rst, sum);
		} else {
			return;
		}
	}
}