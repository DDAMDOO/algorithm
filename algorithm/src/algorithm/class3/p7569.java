package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node7569 {
	int x;
	int y;
	int z;
	int cnt;

	Node7569(int x, int y, int z, int cnt) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.cnt = cnt;
	}
}

public class p7569 {
	public static int[][][] cnt;
	public static int[][][] ary;
	public static int a;
	public static int b;
	public static int h;
	public static int[] nx = { 0, 0, 0, 0, 1, -1 };
	public static int[] ny = { 0, 0, 1, -1, 0, 0 };
	public static int[] nz = { 1, -1, 0, 0, 0, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		ary = new int[h + 1][b + 1][a + 1];
		cnt = new int[h + 1][b + 1][a + 1];

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= b; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= a; k++) {
					ary[i][j][k] = Integer.parseInt(st.nextToken());

					if (ary[i][j][k] == 1) {
						bfs(i, j, k);
					}
				}
			}
		}
	}

	public static void bfs(int z, int y, int x) {
		Queue<Node7569> q = new LinkedList<>();

		q.add(new Node7569(z, y, x, 0));

		while (!q.isEmpty()) {
			Node7569 n = q.poll();

			int cnt = n.cnt + 1;

			for (int a = 0; a < 6; a++) {
				if (ary[z + nz[a]][y + ny[a]][x + nx[a]] == 0) {
					ary[z + nz[a]][y + ny[a]][x + nx[a]] = 1;
					q.add(new Node7569(z + nz[a], y + ny[a], x + nx[a], cnt));
					ary[z + nz[a]][y + ny[a]][x + nx[a]] = cnt;
				}
			}
		}
		
		int rst = Integer.MIN_VALUE;
		
		for (int i = 1; i <= z; i++) {
			for (int j = 1; j <= y; j++) {
				for (int k = 1; k <= x; k++) {
					if (ary[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					if (rst < ary[i][j][k]) {
						rst = ary[i][j][k];
					}
				}
			}
		}
		System.out.println(rst);
	}
}