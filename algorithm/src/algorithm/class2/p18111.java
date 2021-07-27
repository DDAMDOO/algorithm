package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p18111 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[][] ary = new int[a][b];
		int max = 0;
		int min = 500;

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < b; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
				if (ary[i][j] > max) {
					max = ary[i][j];
				}
				if (ary[i][j] < min) {
					min = ary[i][j];
				}
			}
		}

		int time = 2147000000;
		int idx = 0;

		for (int k = max; k >= min; k--) {
			int rst = 0;
			int cnt = c;

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (ary[i][j] == k) {
						continue;
					} else {						
						int gap = Math.abs(k - ary[i][j]);
						
						if (ary[i][j] > k) {
							rst += 2 * gap;
							cnt += gap;
						} else if (ary[i][j] < k) {
							rst += gap;
							cnt -= gap;
						}
					}
				}
			}
			if (cnt < 0) {
				continue;
			}
			if (time > rst) {
				time = rst;
				idx = k;
			}
		}
		System.out.println(time + " " + idx);
	}
}