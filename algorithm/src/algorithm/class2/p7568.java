package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int[][] ary = new int[a][2];
		int[] cnt = new int[a];

		for (int i = 0; i < a; i++) {
			String[] n;
			n = br.readLine().split(" ");
			ary[i][0] = Integer.parseInt(n[0]);
			ary[i][1] = Integer.parseInt(n[1]);
		}

		for (int i = 0; i < a; i++) {
			cnt[i] = 1;
			for (int j = 0; j < a; j++) {
				if (ary[i][0] < ary[j][0] && ary[i][1] < ary[j][1]) {
					cnt[i]++;
				}
			}
			System.out.println(cnt[i]);
		}
	}
}