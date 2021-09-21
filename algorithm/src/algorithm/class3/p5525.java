package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5525 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		String str = br.readLine();
		int answer = 0;
		int[] dp = new int[b];

		for (int i = 0; i < b; i++) {
			dp[i] = 0;
		}

		for (int i = 2; i < b; i++) {
			String tmp = str.substring(i - 2, i + 1);
			if (tmp.equals("IOI")) {
				dp[i] = dp[i - 2] + 1;
			}
			if (dp[i] >= a) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}