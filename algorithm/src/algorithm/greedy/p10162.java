package algorithm.greedy;

import java.util.Scanner;

public class p10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 300;
		int b = 60;
		int c = 10;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;

		int n = sc.nextInt();

		for (;;) {
			if (n >= a) {
				n -= a;
				cnt1++;
			} else if (n >= b) {
				n -= b;
				cnt2++;
			} else if (n >= c) {
				n -= c;
				cnt3++;
			}
			if (n == 0) {
				break;
			} else if (n < c) {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(cnt1 + " " + cnt2 + " " + cnt3);
	}
}