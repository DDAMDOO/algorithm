package algorithm.etc;

import java.util.Scanner;

public class p14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 0 && b > 0) {
			System.out.println(1);
		}
		if (a < 0 && b > 0) {
			System.out.println(2);
		}
		if (a < 0 && b < 0) {
			System.out.println(3);
		}
		if (a > 0 && b < 0) {
			System.out.println(4);
		}
	}
}