package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p11723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashSet<Integer> set = new HashSet<>();

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			int n = 0;

			if (s.equals("add")) {
				n = Integer.parseInt(st.nextToken());
				set.add(n);
			}
			if (s.equals("remove")) {
				n = Integer.parseInt(st.nextToken());
				set.remove(n);
			}

			if (s.equals("check")) {
				n = Integer.parseInt(st.nextToken());
				if (set.contains(n)) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			}

			if (s.equals("toggle")) {
				n = Integer.parseInt(st.nextToken());
				if (set.contains(n))
					set.remove(n);
				else
					set.add(n);
			}

			if (s.equals("all")) {
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
			}
			if (s.equals("empty")) {
				set.clear();
			}
		}
		System.out.println(sb);
	}
}