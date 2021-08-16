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
	public static int r_cnt = 0;
	public static int c_cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int n = (int) Math.pow(2, N);

		while (n > 0) {
			n /= 2;
			
			if (r < r_cnt + n && c < c_cnt + n) {
				cnt += n * n * 0;
			} else if (r < r_cnt + n) {
				// 오른쪽
				cnt += n * n * 1;
				c_cnt += n;
			} else if (c < c_cnt + n) {
				// 아래
				cnt += n * n * 2;
				r_cnt += n;
			} else {
				// 대각선아래
				cnt += n * n * 3;
				r_cnt += n;
				c_cnt += n;
			}
			//1이 되었을 때 마지막으로 남은 나머지 값을 더하고 출력
			if (n == 1) {
				System.out.println(cnt);
				return;
			}
		}
	}
}

//	public static void dq(int a, int row, int col) {
//
//		if (a == 2) {
//			for (int i = 0; i < 4; i++) {
//				if (row + ny[i] == r && col + nx[i] == c) {
//					System.out.println(cnt);
//					return;
//				}
//				cnt++;
//			}
//			return;
//		}
//
//		dq(a / 2, row, col);
//		dq(a / 2, row, col + a / 2);
//		dq(a / 2, row + a / 2, col);
//		dq(a / 2, row + a / 2, col + a / 2);
//	}
//}