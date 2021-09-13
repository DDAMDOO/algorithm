package algorithm.etc;

import java.util.Scanner;

public class floydWarshall {
	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[][] ary = new int[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				ary[i][j] = sc.nextInt();
				if (i != j && ary[i][j] == 0) {
					ary[i][j] = INF;
				}
			}
		}

		for (int k = 0; k < a; k++) {// k는 경유지
			for (int i = 0; i < a; i++) {
				if (i == k) {
					continue;
				} // 경유지가 출발지이면 통과
				for (int j = 0; j < a; j++) {
					if(i==j || j==k) {
						continue;//도착지가 출발지나 경유지인 경우 통과
					}
					if(ary[i][k] + ary[k][j] < ary[i][j]) {
						ary[i][j] = ary[i][k] + ary[k][j];
					}
				}
			}
		}
	}
}