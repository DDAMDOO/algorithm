package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5525 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		String s = "I";
		int index = a * 2 + 1;
		for (int i = 0; i < a; i++) {
			s += "OI";
		}
		int cnt = 0;
		String str = br.readLine();
		for (int i = 0; i < str.length() - index; i++) {
			if (str.substring(i, i + index).equals(s)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}