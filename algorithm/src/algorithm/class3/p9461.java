package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9461 {
	public static long[] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			if (b >= 5) {
				ary = new long[b];
				ary[0] = 1;
				ary[1] = 1;
				ary[2] = 1;
				ary[3] = 2;
				ary[4] = 2;
				dp(b - 1);
			} else {
				ary = new long[5];
				ary[0] = 1;
				ary[1] = 1;
				ary[2] = 1;
				ary[3] = 2;
				ary[4] = 2;
			}
			System.out.println(ary[b - 1]);
		}
	}

	public static long dp(int a) {
		if (ary[a] == 0) {
			ary[a] = dp(a - 1) + ary[a - 5];
		}
		return ary[a];
	}
}