package algorithm.class2;

import java.util.Scanner;

public class p4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				return;
			}
			if (a >= b && a >= c) {
				if (a * a == b * b + c * c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (b >= a && b >= c) {
				if (b * b == a * a + c * c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (c >= a && c >= b) {
				if (c * c == a * a + b * b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
		}
	}
}