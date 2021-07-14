package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1654 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int[] ary = new int[a];
		long max = 0;
		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(br.readLine());
			if (ary[i] > max) {
				max = ary[i];
			}
		}
		long start = 1;
		long end = max;

		while (start <= end) {
			long num = 0;
			long mid = (start + end) / 2;

			for (int i = 0; i < a; i++) {
				num += ary[i] / mid;
			}

			if (num >= b) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(end);
	}
}