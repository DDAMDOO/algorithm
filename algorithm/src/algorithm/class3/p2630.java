package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2630 {
	public static int[][] ary;
	public static int blue = 0;
	public static int white = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		ary = new int[a][a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dq(0, 0, a);
		System.out.println(white);
		System.out.println(blue);
	}

	public static void dq(int x, int y, int size) {
		if (size == 0) {
			return;
		}
		int color = ary[x][y];
		boolean flag = true;

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (ary[i][j] != color) {
					flag = false;
				}
			}
		}

		if (flag == false) {
			size /= 2;
			dq(x, y, size);
			dq(x + size, y, size);
			dq(x, y + size, size);
			dq(x + size, y + size, size);
		} else {
			if (color == 1) {
				blue++;
				return;
			} else {
				white++;
				return;
			}
		}
	}
}