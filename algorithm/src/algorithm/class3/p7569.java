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

	Node7569(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

public class p7569 {
	public static int[][][] ary;
	public static int a;
	public static int b;
	public static int h;
	public static int[] nx = { 0, 0, 0, 0, 1, -1 };
	public static int[] ny = { 0, 0, 1, -1, 0, 0 };
	public static int[] nz = { 1, -1, 0, 0, 0, 0 };
	public static Queue<Node7569> q;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		ary = new int[h + 1][b + 1][a + 1];

		q = new LinkedList<Node7569>();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= b; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= a; k++) {
					ary[i][j][k] = Integer.parseInt(st.nextToken());

					if (ary[i][j][k] == 1) {
						q.add(new Node7569(i, j, k));
					}
				}
			}
		}
		bfs();

		int rst = Integer.MIN_VALUE;

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= a; k++) {
					if (ary[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					rst = Math.max(rst, ary[i][j][k]);
//					System.out.print(ary[i][j][k] + " ");
				}
//				System.out.println();
			}
		}
//		System.out.println(rst);
		return;
	}

	public static void bfs() {
		while (!q.isEmpty()) {
			Node7569 n = q.poll();

			int x = n.x;
			int y = n.y;
			int z = n.z;
			
			for (int i = 0; i < 6; i++) {
				int xx = x + nx[i];
				int yy = y + ny[i];
				int zz = z + nz[i];

				if (xx > 0 && xx <= h && yy > 0 && yy <= b && zz > 0 && zz <= a) {	
					if (ary[xx][yy][zz] == 0) {
						System.out.println(xx + " "+ yy + " " + zz);
						q.add(new Node7569(xx, yy, zz));
						ary[xx][yy][zz] = ary[n.x][n.y][n.z] + 1;
					}
				}
			}
			System.out.println();
		}
	}
}