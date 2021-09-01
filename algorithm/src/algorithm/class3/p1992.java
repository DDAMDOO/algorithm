package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1992 {
	public static int a;
	public static int[][] ary;
	public static String s = "";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		ary = new int[a][a];

		for (int i = 0; i < a; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < a; j++) {
				ary[i][j] = Integer.parseInt(s[j]);
			}
		}

		dq(ary, 0, 0, a);
		System.out.println(s);
	}

	public static void dq(int[][] n, int start, int end, int size) {
		int k = n[start][end];

		for (int i = start; i < start + size; i++) {
			for (int j = end; j < end + size; j++) {
				if (k != n[i][j]) {
					s += "(";

					dq(n, start, end, size / 2);
					dq(n, start, end + size / 2, size / 2);
					dq(n, start + size / 2, end, size / 2);
					dq(n, start + size / 2, end + size / 2, size / 2);

					s += ")";
					return;
				}
			}
		}
		if (k == 1) {
			s += "1";
		} else {
			s += "0";
		}
	}
}