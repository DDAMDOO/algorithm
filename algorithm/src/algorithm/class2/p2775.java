package algorithm.class2;

import java.util.Scanner;

public class p2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] ary = new int[15][15];
		for (int i = 0; i < 15; i++) {
			ary[0][i] = i;
			ary[i][1] = 1;
		}

		for (int i = 1; i < 15; i++) {	
			for (int j = 2; j < 15; j++) {
				ary[i][j] = ary[i - 1][j] + ary[i][j - 1];
			}
		}
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(ary[k][n]);
		}
	}
}
