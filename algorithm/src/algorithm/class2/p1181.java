package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		String[] s = new String[a];
		String temp;
		for (int i = 0; i < a; i++) {
			s[i] = br.readLine();
			for (int j = 0; j < i; j++) {
				if (s[i].length() < s[j].length()) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				} else if (s[i].length() == s[j].length()) {
					for (int k = 0; k < s[i].length(); k++) {
						System.out.println(s[i].charAt(k) + " " + s[j].charAt(k));
//						if(s[i].charAt(k) >s[i].charAt(k)) {
//							
//						}
					}
				}
			}
		}
//		for (int i = 0; i < a; i++) {
//			System.out.println(s[i]);
//		}
	}

}
