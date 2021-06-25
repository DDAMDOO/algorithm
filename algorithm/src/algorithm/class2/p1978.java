package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 0;
		int rst = 0;
		
		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < a; i++) {
			cnt = 0;
			for (int j = 2; j <= Math.sqrt(ary[i]); j++) {
				if (ary[i] % j == 0) {
					cnt++;
				}
			}
			if(ary[i] != 1 && cnt == 0) {
				rst++;
			}
		}
		System.out.println(rst);
	}
}