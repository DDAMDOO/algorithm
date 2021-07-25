package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1966 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			LinkedList<int[]> q = new LinkedList<>();

			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				q.add(new int[] { j, Integer.parseInt(st.nextToken()) });
			}

			int cnt = 0;

			while (!q.isEmpty()) {
				boolean flag = true;
				int[] idx = q.poll();
				for (int j = 0; j < q.size(); j++) {
					if (idx[1] < q.get(j)[1]) {
						q.add(idx);
						flag = false;
						break;
					}
				}
				
				if(flag == false) {
					continue;
				}
				
				cnt++;
				
				if(m == idx[0]) {
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}