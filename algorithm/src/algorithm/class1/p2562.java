package algorithm.class1;

import java.util.Scanner;

public class p2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 1; i <= 9; i++) {
			int a = sc.nextInt();
			if (max <= a) {
				max = a;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
