package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node10026 {
	int x;
	int y;

	Node10026(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class p10026 {
	public static boolean[][] visited;
	public static int a;
	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, -1, 1, 0 };
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());

		String[][] s = new String[a][a];

		for (int i = 0; i < a; i++) {
			s[i] = br.readLine().split("");
		}
	
		visited = new boolean[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (visited[i][j] == false) {
					bfs(i, j, s);
				}
			}
		}
		System.out.print(cnt);
		cnt = 0;
		
		String[][] ary = s.clone();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (ary[i][j].equals("R")) {
					ary[i][j] = "G";
				}
			}
		}

		visited = new boolean[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (visited[i][j] == false) {
					bfs(i, j, ary);
				}
			}
		}

		System.out.println(" " + cnt);
	}

	public static void bfs(int x, int y, String[][] s) {
		Queue<Node10026> q = new LinkedList<>();
		q.add(new Node10026(x, y));
		visited[x][y] = true;
		while (!q.isEmpty()) {
			Node10026 n = q.poll();
			for (int i = 0; i < 4; i++) {
				int X = n.x + nx[i];
				int Y = n.y + ny[i];

				if (X >= 0 && Y >= 0 && X < a && Y < a) {
					if (s[x][y].equals(s[X][Y]) && visited[X][Y] == false) {
						visited[X][Y] = true;
						q.add(new Node10026(X, Y));
					}
				}
			}
		}
		cnt++;
	}
}