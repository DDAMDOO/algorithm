package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int sum = 0;
			double cnt = 0;
			int[] ary = new int[k];
			for (int j = 0; j < k; j++) {
				ary[j] = Integer.parseInt(st.nextToken());
				sum += ary[j];
			}
			for (int j = 0; j < k; j++) {
				if (ary[j] > sum / k) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(double)((cnt/k)*100));
		}
	}
}