package algorithm.greedy;

import java.util.Scanner;

public class p2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int q = 25;
			int d = 10;
			int n = 5;
			int p = 1;
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			int c4 = 0;
			int num = sc.nextInt();

			for (;;) {
				if (num >= q) {
					num -= q;
					c1++;
				} else if (num >= d) {
					num -= d;
					c2++;
				} else if (num >= n) {
					num -= n;
					c3++;
				} else if (num >= p) {
					num -= p;
					c4++;
				}

				if (num == 0) {
					break;
				}
			}
			System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
		}
	}
}