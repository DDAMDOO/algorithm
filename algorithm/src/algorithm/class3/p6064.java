package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p6064 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[][] ary = new int[a][4];
		int[] rst = new int[a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			ary[i][0] = Integer.parseInt(st.nextToken());// M
			ary[i][1] = Integer.parseInt(st.nextToken());// N
			ary[i][2] = Integer.parseInt(st.nextToken());// x
			ary[i][3] = Integer.parseInt(st.nextToken());// y
			rst[i] = -1;
		}

		for (int i = 0; i < a; i++) {
			for (int j = 1; j <= ary[i][0] * ary[i][1]; j++) {
				if (j % ary[i][0] == ary[i][2] && j % ary[i][1] == ary[i][3]) {
					rst[i] = j;
					break;
				}
			}
		}

		for (int i = 0; i < a; i++)
			System.out.println(rst[i]);
	}
}