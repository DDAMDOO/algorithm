package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1157 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ary = new int[26];
		int max = 0;
		int idx = 0;
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			ary[((int) (s.charAt(i)) - 65) % 32]++;
		}

		for (int i = 0; i < 26; i++) {
			if (max < ary[i]) {
				max = ary[i];
				idx = i;
			}
		}

		for (int i = 0; i < 26; i++) {
			if(max == ary[i] && i != idx) {
				idx = -2;
			}
		}
		System.out.println((char) (idx + 65));
	}
}
