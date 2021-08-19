package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1780 {
	public static int[][] ary;
	public static boolean[][] visited;
	public static int cnt;
	public static int cnt1;
	public static int cnt2;
	public static int a;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		cnt = 0;
		cnt1 = 0;
		cnt2 = 0;

		a = Integer.parseInt(br.readLine());

		ary = new int[a][a];
		visited = new boolean[a][a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0, 0, a);

		System.out.println(cnt);
		System.out.println(cnt1);
		System.out.println(cnt2);
	}

	public static void dfs(int x, int y, int size) {
//		System.out.println(x + " " + y);
		int n = ary[x][y];
		int c = 0;

		if (size < 1) {
			return;
		}

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (ary[i][j] != n) {
					int s = size / 3;

					dfs(x, y, s);
					dfs(x, y + s, s);
					dfs(x, y + 2 * s, s);
					dfs(x + s, y, s);
					dfs(x + s, y + s, s);
					dfs(x + s, y + 2 * s, s);
					dfs(x + s * 2, y, s);
					dfs(x + s * 2, y + s, s);
					dfs(x + s * 2, y + 2 * s, s);

					c++;

					return;
				}
			}
		}
		if (c == 0) {
			if (n == -1) {
				cnt++;
			} else if (n == 0) {
				cnt1++;
			} else {
				cnt2++;
			}
		}
		return;
	}
}