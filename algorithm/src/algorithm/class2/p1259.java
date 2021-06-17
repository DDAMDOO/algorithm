package algorithm.class2;

import java.util.Scanner;

public class p1259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		int flag = 0;
		
		for (;;) {
			String s = sc.nextLine();
			if (Integer.parseInt(s) == 0) {
				return;
			}
			if (s.length() % 2 == 0) {
				idx = s.length() / 2;
				for (int i = 0; i < s.length() / 2; i++) {
					if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
						flag = -1;
					}
				}
			} else {
				idx = s.length() / 2 + 1;
				for (int i = 1; i <= s.length() / 2; i++) {
					if (s.charAt(idx - i - 1) != s.charAt(idx + i-1)) {
						flag = -1;
					}
				}
			}
			if (flag == -1) {
				flag = 0;
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}
}
