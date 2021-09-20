package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p9019 {
	public static String[] rst = new String[10000];
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			init(rst);
			visited = new boolean[10000];

			bfs(a, b);
		}
	}

	public static void bfs(int a, int b) {
		Queue<Integer> q = new LinkedList<>();
		visited[a] = true;
		q.add(a);

		while (!q.isEmpty() && !visited[b]) {
			int k = q.poll();

			int d = (k * 2) % 10000;
			int s = k == 0 ? 9999 : k - 1;
			int l = (k % 1000) * 10 + k / 1000;
			int r = (k % 10) * 1000 + k / 10;

			if (visited[d] == false) {
				q.add(d);
				visited[d] = true;
				rst[d] = rst[k] + "D";
			}

			if (visited[s] == false) {
				q.add(s);
				visited[s] = true;
				rst[s] = rst[k] + "S";
			}

			if (visited[l] == false) {
				q.add(l);
				visited[l] = true;
				rst[l] = rst[k] + "L";
			}

			if (visited[r] == false) {
				q.add(r);
				visited[r] = true;
				rst[r] = rst[k] + "R";
			}
		}
		System.out.println(rst[b]);
	}

	public static void init(String[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = "";
		}
	}
}