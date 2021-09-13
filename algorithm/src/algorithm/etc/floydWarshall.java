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

		for (int k = 0; k < a; k++) {// k�� ������
			for (int i = 0; i < a; i++) {
				if (i == k) {
					continue;
				} // �������� ������̸� ���
				for (int j = 0; j < a; j++) {
					if(i==j || j==k) {
						continue;//�������� ������� �������� ��� ���
					}
					if(ary[i][k] + ary[k][j] < ary[i][j]) {
						ary[i][j] = ary[i][k] + ary[k][j];
					}
				}
			}
		}
	}
}