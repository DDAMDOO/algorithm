package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt = 0;

		int[][] ary = new int[a][b];
		int[][] ary1 = new int[a][b];

		for (int i = 0; i < a; i++) {
			String[] line = new String[b];
			line = br.readLine().split("");
			for (int j = 0; j < b; j++) {
				ary[i][j] = Integer.parseInt(line[j]);
			}
		}
		for (int i = 0; i < a; i++) {
			String[] line = new String[b];
			line = br.readLine().split("");
			for (int j = 0; j < b; j++) {
				ary1[i][j] = Integer.parseInt(line[j]);
			}
		}

		for (int i = 0; i < a - 2; i++) {
			for (int j = 0; j < b - 2; j++) {
				if (ary[i][j] != ary1[i][j]) {
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							ary1[i + k][j + l] = 1 - ary1[i + k][j + l];
						}
					}
					cnt++;
				}
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (ary[i][j] != ary1[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(cnt);
	}
}