package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1107 {
	public static boolean ary[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		ary = new boolean[10];

		if (b != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < b; i++) {
				ary[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int init = Math.abs(a - 100);

		for (int i = 0; i <= 1000000; i++) {
			if (count(i) > 0) {
				int k = Math.abs(a - i);
				init = Math.min(init, k + count(i));
			}
		}
		System.out.println(init);
	}

	public static int count(int n) {
		if (n == 0) {
			if (ary[n] == true) {
				return 0;
			} else {
				return 1;
			}
		}
		int cnt = 0;
		while (n > 0) {
			if (ary[n % 10] == true) {
				return 0;
			}
			n /= 10;
			cnt++;
		}
		return cnt;
	}
}