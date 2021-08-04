package algorithm.class3;

import java.util.Scanner;

public class p9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ary = new int[11];

		ary[1] = 1;
		ary[2] = 2;
		ary[3] = 4;

		for (int i = 4; i < ary.length; i++) {
			ary[i] = ary[i - 1] + ary[i - 2] + ary[i - 3];
		}
		for (int i = 0; i < a; i++) {
			int n = sc.nextInt();
			System.out.println(ary[n]);
		}
	}
}