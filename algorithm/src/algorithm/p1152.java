package algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p1152 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(s, " ");
		cnt = st.countTokens();
		System.out.println(cnt);
	}
}
