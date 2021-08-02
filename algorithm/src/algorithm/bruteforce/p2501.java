package algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				cnt++;
				if (cnt == b) {
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println(0);
		return;
	}
}