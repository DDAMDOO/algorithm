package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class p10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());

		String[][] ary = new String[a][2];
		String[][] temp = new String[1][1];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			ary[i][0] = st.nextToken();
			ary[i][1] = st.nextToken();
		}

		Arrays.sort(ary, new Comparator<String[]>() {
			public int compare(String[] a, String[] b) {
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
			}
		});

		for (int i = 0; i < a; i++) {
			sb.append(ary[i][0] + " " + ary[i][1] + "\n");
		}
		System.out.println(sb);
	}

}
