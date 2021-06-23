package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		String[] s = new String[a];

		for (int i = 0; i < a; i++) {
			s[i] = br.readLine();
		}

		Arrays.sort(s, new Comparator<String>() {
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				} else {
					return a.length() - b.length();
				}
			}
		});

		System.out.println(s[0]);

		for (int i = 1; i < a; i++) {
			if (!s[i].equals(s[i - 1])) {
				System.out.println(s[i]);
			}
		}
	}
}
