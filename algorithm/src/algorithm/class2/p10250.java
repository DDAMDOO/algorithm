package algorithm.class2;

import java.util.Scanner;

public class p10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] room = new int[a];
		for (int i = 0; i < a; i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			int ho = n / w;
			if (n % w != 0) {
				ho += 1;
			}
			int floor = n % w;
			if (floor == 0) {
				floor = w;
			}
			room[i] = floor * 100 + ho;
		}
		for (int i = 0; i < a; i++) {
			System.out.println(room[i]);
		}
	}
}
