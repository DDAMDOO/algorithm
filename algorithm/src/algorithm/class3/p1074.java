package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1074 {
	public static int[] nx = { 0, 1, 0, 1 };
	public static int[] ny = { 0, 0, 1, 1 };
	public static int cnt = 0;
	public static int r;
	public static int c;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int n = (int) Math.pow(2, N);

		dq(n, 0, 0);
	}

	public static void dq(int a, int row, int col) {

		if (a == 2) {
			for (int i = 0; i < 4; i++) {
				if (row + ny[i] == r && col + nx[i] == c) {
					System.out.println(cnt);
					return;
				}
				cnt++;
			}
			return;
		}

		dq(a / 2, row, col);
		dq(a / 2, row, col + a / 2);
		dq(a / 2, row + a / 2, col);
		dq(a / 2, row + a / 2, col + a / 2);
	}
}