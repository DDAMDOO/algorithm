package algorithm;

import java.util.Scanner;

public class p2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		a = a % 10 * 100 + a % 100 - a % 10 + (a - a % 100) / 100;
		b = b % 10 * 100 + b % 100 - b % 10 + (b - b % 100) / 100;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}