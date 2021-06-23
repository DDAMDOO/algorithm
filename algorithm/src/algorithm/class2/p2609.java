package algorithm.class2;

import java.util.Scanner;

public class p2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println(a);
		System.out.println(c/a);
	}
}
