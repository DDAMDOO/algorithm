package algorithm.class1;

import java.util.Scanner;

public class p2475 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a;
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();
			sum += a * a;
		}
		System.out.println(sum % 10);
	}
}
