package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11727 {
	public static long[] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		ary = new long[a + 1];
		ary[1] = 1;
		if (a >= 2) {
			ary[2] = 3;
		}

		System.out.println(dp(a));
	}

	public static long dp(int a) {
		if (ary[a] == 0) {
			ary[a] = (dp(a - 1) + 2 * dp(a - 2)) % 10007;
		}
		return ary[a];
	}
}