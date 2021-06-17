package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int rst = 32;

		boolean[][] ary = new boolean[a][b];

		for (int i = 0; i < a; i++) {
			String s = br.readLine();
			for (int j = 0; j < b; j++) {
				if (s.charAt(j) == 'B') {
					ary[i][j] = true;
				} else {
					ary[i][j] = false;
				}
			}
		}
		boolean flag = true;
		for (int i = 0; i <= a - 8; i++) {
			for (int j = 0; j <= b - 8; j++) {
				int cnt = 0;
				for (int ii = 0; ii < 8; ii++) {
					for (int jj = 0; jj < 8; jj++) {
						if (ary[i + ii][j + jj] == flag) {
							cnt++;
						}
						flag = !flag;
					}
					flag = !flag;
				}
				if (cnt > 32) {
					cnt = 64 - cnt;
				}
				if (cnt < rst) {
					rst = cnt;
				}
			}
		}
		System.out.println(rst);
	}
}