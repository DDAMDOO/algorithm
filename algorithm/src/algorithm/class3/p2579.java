package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2579 {
	public static int[] ary;
	public static int[] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		ary = new int[a + 1];
		dp = new int[a + 1];

		for (int i = 1; i <= a; i++) {
			ary[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = ary[1];

		if (a >= 2) {
			dp[2] = ary[1] + ary[2];
		}

		System.out.println(dp(a));
	}

	public static int dp(int a) {
		if (dp[a] == 0 && a != 0) {
			dp[a] = Math.max(dp(a - 2), dp(a - 3) + ary[a - 1]) + ary[a];
		}

		return dp[a];
	}
}