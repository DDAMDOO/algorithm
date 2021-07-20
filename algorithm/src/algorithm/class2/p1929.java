package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = a; i <= b; i++) {
			int cnt = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 0) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
}