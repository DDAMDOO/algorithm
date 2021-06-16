package algorithm;

import java.util.Scanner;

public class P2439 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a;

		a = sc.nextInt();

		for (int i = a; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= a - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
