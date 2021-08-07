package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11726 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a + 2];
		ary[1] = 1;
		ary[2] = 2;
		for (int i = 3; i <= a; i++) {
			ary[i] = (ary[i - 1] + ary[i - 2]) % 10007;
		}
		System.out.println(ary[a]);
	}
}