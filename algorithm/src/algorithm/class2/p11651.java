package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int[][] ary = new int[a][2];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			ary[i][0] = Integer.parseInt(st.nextToken());
			ary[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(ary, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[1] == b[1]) {
					return a[0] - b[0];
				} else {
					return a[1] - b[1];
				}
			}
		});

		for (int i = 0; i < a; i++) {
			sb.append(ary[i][0] + " " + ary[i][1] + "\n");
		}
		System.out.println(sb);
	}
}