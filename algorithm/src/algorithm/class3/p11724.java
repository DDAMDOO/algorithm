package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11724 {
	public static int node;
	public static int line;
	public static int[][] ary;
	public static boolean[] visited;
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		ary = new int[node + 1][node + 1];
		visited = new boolean[node + 1];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			ary[x][y] = 1;
			ary[y][x] = 1;
			if(!list.contains(x)) {
				list.add(x);				
			}
			if(!list.contains(y)) {
				list.add(y);				
			}
		}

		for (int i = 1; i <= node; i++) {
			for (int j = i + 1; j <= node; j++) {
				if (ary[i][j] == 1 && visited[i] == false) {
					bfs(i);
				}
			}
		}
		System.out.println(cnt + node-list.size());
	}

	public static void bfs(int a) {
		visited[a] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(a);
		while (!q.isEmpty()) {
			int n = q.poll();
			visited[n] = true;
			for (int idx = 1; idx <= node; idx++) {
				if (ary[n][idx] == 1 && visited[idx] == false) {
					q.add(idx);
					visited[idx] = true;
				}
			}
		}
		cnt++;
	}
}