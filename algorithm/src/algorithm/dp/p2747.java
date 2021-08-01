package algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2747 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 1;
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			for (int i = 1; i < n; i++) {
				sum = a + b;
				a = b;
				b = sum;
			}
			System.out.println(sum);
		}
	}
}