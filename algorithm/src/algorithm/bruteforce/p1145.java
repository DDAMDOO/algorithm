package algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1145 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] ary = new int[5];
		int a = 5;
		int rst = 99 * 99 * 99;

		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				for (int k = j + 1; k < a; k++) {
					int tmp = ary[i] * ary[j] / gcd(ary[i], ary[j]);
					tmp = tmp * ary[k] / gcd(tmp, ary[k]);
					if (tmp < rst) {
						rst = tmp;
					}
				}
			}
		}
		System.out.println(rst);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}