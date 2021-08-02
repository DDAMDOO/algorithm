package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1003 {
	public static int[][] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			int a = Integer.parseInt(br.readLine());
			ary = new int[a + 2][2];

			for (int i = 0; i <= a + 1; i++) {
				ary[i][0] = -1;
				ary[i][1] = -1;
			}
			ary[0][0] = 1;
			ary[0][1] = 0;
			ary[1][0] = 0;
			ary[1][1] = 1;
			fib(a);
			System.out.println(ary[a][0] + " " + ary[a][1]);
		}
	}

	public static int[] fib(int a) {
		if (ary[a][0] == -1 || ary[a][1] == -1) {
			ary[a][0] = fib(a - 1)[0] + fib(a - 2)[0];
			ary[a][1] = fib(a - 1)[1] + fib(a - 2)[1];
		}
		return ary[a];
	}
}