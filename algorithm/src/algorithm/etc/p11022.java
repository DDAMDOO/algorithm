package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sb.append("Case #" + (int) (i + 1) + ": " + n + " + " + m + " = " + (int)(n + m) + "\n");
		}
		System.out.println(sb);
	}
}