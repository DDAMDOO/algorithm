package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		String s1 = br.readLine();
		String s2 = br.readLine();

		int cnt = Integer.parseInt(br.readLine());
		String[] s = new String[a + b];
		boolean[] d = new boolean[a + b];

		for (int i = 0; i < a; i++) {
			s[i] = s1.charAt(a - 1 - i) + "";
			d[i] = true;
		}
		for (int i = a; i < a + b; i++) {
			s[i] = s2.charAt(i - a) + "";
			d[i] = false;
		}

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < a + b - 1; j++) {
				if (d[j] == true && d[j + 1] == false) {
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;

					boolean flag = d[j];
					d[j] = d[j + 1];
					d[j + 1] = flag;
					j++;
				}
			}
		}

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
}