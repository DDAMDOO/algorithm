package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11339 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ary);

		int sum = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				sum += ary[j];
			}
		}
		System.out.println(sum);
	}
}