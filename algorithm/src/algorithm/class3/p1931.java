package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p1931 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		int[][] ary = new int[a][2];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			ary[i][0] = Integer.parseInt(st.nextToken());
			ary[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(ary, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[1] == b[1]) {
					return a[0] - b[0];
				}
				return a[1] - b[1];
			}
		});
		int n = 0;
		int cnt = 0;
		for (int i = 0; i < a; i++) {
			if (ary[i][0] >= n) {
				cnt++;
				n = ary[i][1];
			}
		}
		System.out.println(cnt);
	}
}