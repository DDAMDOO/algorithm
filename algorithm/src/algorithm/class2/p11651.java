package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int[][] ary = new int[a][2];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			ary[i][1] = Integer.parseInt(st.nextToken());
			ary[i][0] = Integer.parseInt(st.nextToken());
		}

	}
}