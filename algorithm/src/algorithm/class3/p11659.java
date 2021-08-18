package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] ary = new int[a + 1];
		ary[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= a; i++) {
			ary[i] = Integer.parseInt(st.nextToken()) + ary[i - 1];
		}

		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			System.out.println(ary[k] - ary[j - 1]);
		}
	}
}