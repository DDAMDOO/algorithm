package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1676 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (a >= 5) {
			cnt += a / 5;
			a /= 5;
		}
		System.out.println(cnt);
	}
}