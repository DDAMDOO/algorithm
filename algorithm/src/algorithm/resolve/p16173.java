package algorithm.resolve;

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
			node node = q.poll();
			if (visited[node.x][node.y]) {
				continue;
			}
			if (ary[node.x][node.y] == -1) {
				finish = true;
				break;
			}

			visited[node.x][node.y] = true;

			int jump = ary[node.x][node.y];
			if (node.x + jump < a) {
				q.add(new node(node.x + jump, node.y));
			}
			if(node.y + jump < a) {
				q.add(new node(node.x, node.y+jump));
			}
		}
		
		if(finish == false) {
			System.out.println("Hing");
		} else {
			System.out.println("HaruHaru");
		}
	}
}