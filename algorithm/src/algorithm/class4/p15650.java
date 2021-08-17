package algorithm.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15650 {
	public static int a;
	public static int b;
	public static int[] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		ary = new int[b];
		dfs(1, 0);

	}

	public static void dfs(int n, int depth) {
		if (depth == b) {
			for (int i = 0; i < ary.length; i++) {
				System.out.print(ary[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = n; i <= a; i++) {
			ary[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
}