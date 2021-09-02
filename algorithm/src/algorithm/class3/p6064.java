package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p6064 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] rst = new int[a];
		for (int i = 0; i < a; i++) {
			rst[i] = -1;
		}
		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken());// M
			int N = Integer.parseInt(st.nextToken());// N
			int x = Integer.parseInt(st.nextToken());// x
			int y = Integer.parseInt(st.nextToken());// y

			int k = M * N / gcd(M, N);
			for (int j = 0; j  < k; j++) {
				System.out.println(j * M + x - y);
				if ((j * M + x - y) % N == 0) {
					rst[i] = j * M + x;
				}
			}
		}
		
		for (int i = 0; i < a; i++) {
			System.out.println(rst[i]);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}