package algorithm.class1;

import java.util.Scanner;

public class p2438 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a;

		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
