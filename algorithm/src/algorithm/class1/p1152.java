package algorithm.class1;

import java.util.Scanner;
import java.util.StringTokenizer;

//public class p1152 {
//	public static void main(String argv[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		String s = sc.nextLine();
//		int cnt = 0;
//		StringTokenizer st = new StringTokenizer(s, " ");
//		cnt = st.countTokens();
//		System.out.println(cnt);
//	}
//}

public class p1152 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int cnt = 0;
		if(s.charAt(0) != ' ') {
			cnt = 1;
		}
		for(int i = 0; i < s.length(); i++) {
			if(i < s.length() - 1) {				
				if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
