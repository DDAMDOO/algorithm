package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] ary = new int[a];

		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;

		for (int i = a - 1; i >= 0; i--) {
			while (b >= ary[i]) {
				if (b >= ary[i]) {
					cnt++;
					b -= ary[i];
				}
			}
		}
		System.out.println(cnt);
	}
}