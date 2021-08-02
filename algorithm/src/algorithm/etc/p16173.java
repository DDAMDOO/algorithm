package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class node {
	int x;
	int y;

	public node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class p16173 {
	public static Integer[][] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int a = Integer.parseInt(br.readLine());
		ary = new Integer[a][a];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Queue<node> q = new LinkedList<>();
		boolean[][] visited = new boolean[a][a];
		boolean finish = false;

		q.add(new node(0, 0));
		while (!q.isEmpty()) {
			node tmp = q.poll();
			if (visited[tmp.x][tmp.y]) {
				continue;
			}
			if (ary[tmp.x][tmp.y] == -1) {
				finish = true;
				break;
			}

			visited[tmp.x][tmp.y] = true;

			int jump = ary[tmp.x][tmp.y];
			if (tmp.x + jump < a) {
				q.add(new node(tmp.x + jump, tmp.y));
			}
			if(tmp.y + jump < a) {
				q.add(new node(tmp.x, tmp.y+jump));
			}
		}
		
		if(finish == false) {
			System.out.println("Hing");
		} else {
			System.out.println("HaruHaru");
		}
	}
}