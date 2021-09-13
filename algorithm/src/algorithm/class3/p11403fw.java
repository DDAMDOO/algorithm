package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11403fw {
	public static int a;
	public static int[][] ary;
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		ary = new int[a + 1][a + 1];

		for (int i = 1; i <= a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int k = 1; k <= a; k++) {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= a; j++) {
					if (ary[i][k] == 1 && ary[k][j] == 1) {// i에서 k를 거쳐 j로 갈 수 있는지 유무
						ary[i][j] = 1;
					}
				}
			}
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}
}