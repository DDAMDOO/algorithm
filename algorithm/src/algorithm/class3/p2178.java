package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot {
	int x;
	int y;

	Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class p2178 {
	public static int row;
	public static int col;

	public static int[][] ary;
	public static boolean[][] visited;

	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, 1, -1, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		ary = new int[row][col];

		visited = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < col; j++) {
				ary[i][j] = Integer.parseInt(s[j]);
			}
		}
		bfs(0, 0);

		System.out.println(ary[row - 1][col - 1]);

	}

	public static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<>();
		q.add(new Dot(x, y));

		while (!q.isEmpty()) {
			Dot n = q.poll();
			for (int i = 0; i < 4; i++) {
				int x_ = n.x + nx[i];
				int y_ = n.y + ny[i];
				if (x_ >= 0 && x_ < row && y_ >= 0 && y_ < col) {
					if (visited[x_][y_] == false && ary[x_][y_] == 1) {
						ary[x_][y_] = ary[n.x][n.y] + 1;
						q.add(new Dot(x_, y_));
					}
					visited[x_][y_] = true;
				}
			}
		}
	}
}