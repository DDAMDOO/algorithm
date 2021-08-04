package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17626 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a + 1];
		ary[1] = 1;
		int n = 0;
		
		for (int i = 2; i <= a; i++) {
			n = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				n = Math.min(n, ary[i-j*j]);
			}
			ary[i] = n + 1;
		}
		System.out.println(ary[a]);
	}
}