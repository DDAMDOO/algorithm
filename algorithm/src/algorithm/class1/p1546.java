package algorithm;

import java.util.Scanner;

public class p1546 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		double max = 0;
		double sum = 0;
		a = sc.nextInt();

		double[] ary = new double[a];

		for (int i = 0; i < a; i++) {
			ary[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			if (ary[i] >= max) {
				max = ary[i];
			}
		}
		for (int i = 0; i < a; i++) {
			sum += ary[i] / max * 100;
		}

		System.out.println(sum / a);
	}
}