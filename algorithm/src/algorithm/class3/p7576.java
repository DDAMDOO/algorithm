package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p7576 {

	public static class Node {
		int x;
		int y;
		int cnt;

		Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, 1, -1, 0 };
	public static int[][] ary;
	public static int x;
	public static int y;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());

		ary = new int[x][y];

		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < y; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs();
	}

	public static void bfs() {
		Queue<Node> q = new LinkedList<>();
		int cnt = 0;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (ary[i][j] == 1) {
					Node n = new Node(i, j, 0);

					q.add(n);
				}
			}
		}

		while (!q.isEmpty()) {
			Node node = q.poll();
			cnt = node.cnt;
			
			for (int i = 0; i < 4; i++) {
				int X = node.x + nx[i];
				int Y = node.y + ny[i];

				if (X >= 0 && X < x && Y >= 0 && Y < y) {
					if (ary[X][Y] == 0) {
						ary[X][Y] = 1;
						q.add(new Node(X, Y, cnt + 1));
					}
				}
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (ary[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(cnt);
	}
}