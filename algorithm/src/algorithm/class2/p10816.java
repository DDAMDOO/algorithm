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
			int min = 0;
			int max = ary.length - 1;
			int index = ary.length / 2;
			int k = Integer.parseInt(st.nextToken());
			int cnt = 1;
			for (int j = 0; j <= min; j++) {
				System.out.println("min : " + min + "cnt : " + cnt);
				if (k > ary[min]) {
					min += index / cnt;
				} else if (k < ary[min]) {
					min -= index / cnt;
				} else {
					break;
				}
				cnt++;
			}
		}
	}
}