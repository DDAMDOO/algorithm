package algorithm.class2;

import java.util.Scanner;

public class p2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = sc.nextInt();
		int[] ary = new int[a];
		int rst = 0;

		for (int i = 0; i < a; i++) {
			ary[i] = sc.nextInt();
		}

		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				for (int k = j + 1; k < a; k++) {
					if (ary[i] + ary[j] + ary[k] > rst && ary[i] + ary[j] + ary[k] <= num) {
						rst = ary[i] + ary[j] + ary[k];
					}
				}
			}
		}
		System.out.println(rst);
	}
}