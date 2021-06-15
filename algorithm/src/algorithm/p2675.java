package algorithm;

import java.util.Scanner;

public class p2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] n = new int[a];
		String[] s = new String[a];
		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();
			s[i] = sc.nextLine();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < s[i].length(); j++) {
				for (int k = 0; k < n[i]; k++) {
					System.out.print(s[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}
