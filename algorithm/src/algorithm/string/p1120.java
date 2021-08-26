package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1120 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String s1 = st.nextToken();
		String s2 = st.nextToken();
		int cnt = Integer.MAX_VALUE;

		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			int tmp = 0;

			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s2.charAt(i + j)) {
					tmp++;
				}
			}
			if (tmp < cnt) {
				cnt = tmp;
			}
		}

		System.out.println(cnt);
	}
}