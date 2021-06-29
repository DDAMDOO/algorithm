package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2750 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];
		int temp;

		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < a - 1; i++) {
			for (int j = i; j < a; j++) {
				if (ary[i] > ary[j]) {
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		for (int i = 0; i < a; i++) {
			System.out.println(ary[i]);
		}
	}

}
