package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10816 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ary);
		int b = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			int k = Integer.parseInt(st.nextToken());
			sb.append(max(k, ary) - min(k, ary) + " ");
		}
		System.out.println(sb);
	}

	public static int min(int a, int[] ary) {
		int start = 0;
		int end = ary.length;
		int mid;

		while (start < end) {
			mid = start + (end - start) / 2;
			if (a <= ary[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static int max(int a, int[] ary) {
		int start = 0;
		int end = ary.length;
		int mid;

		while (start < end) {
			mid = start + (end - start) / 2;
			if (a >= ary[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}
}