package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	int nx;
	int ny;

	Node(int nx, int ny) {
		this.nx = nx;
		this.ny = ny;
	}
}

public class p1012 {
	public static int[] dx = { 0, 0, -1, 1 };
	public static int[] dy = { 1, -1, 0, 0 };
	public static boolean[][] visited;
	public static int[][] ary;
	public static int x;
	public static int y;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			int cnt = Integer.parseInt(st.nextToken());

			ary = new int[x][y];
			visited = new boolean[x][y];

			for (int j = 0; j < cnt; j++) {
				st = new StringTokenizer(br.readLine());
				ary[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}

			int count = 0;

			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					if (visited[j][k] == false && ary[j][k] == 1) {
						bfs(j, k);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void bfs(int row, int col) {
		Queue<Node> q = new LinkedList<>();
		Node node = new Node(row, col);

		q.add(node);

		while (!q.isEmpty()) {
			Node n = q.poll();

			visited[n.nx][n.ny] = true;

			for (int i = 0; i < 4; i++) {
				int _x = n.nx + dx[i];
				int _y = n.ny + dy[i];
				
				if (_x >= 0 && _x < x && _y >= 0 && _y < y) {
					if (visited[_x][_y] == false && ary[_x][_y] == 1) {
						Node node1 = new Node(_x, _y);
						q.add(node1);
						visited[_x][_y] = true;
					}
				}
			}
		}
	}
}