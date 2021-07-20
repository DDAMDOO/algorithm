package algorithm.etc;

import java.util.Scanner;

public class p3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		System.out.println((int)(1 - a) + " " + (int)(1 - b) + " " + (int)(2 - c) + " " + (int)(2 - d) + " " + (int)(2 - e) + " " + (int)(8 - f));
	}
}