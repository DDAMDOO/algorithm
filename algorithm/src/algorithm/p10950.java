package algorithm;

import java.util.Scanner;

class p10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ary = new int[a];
		for (int i = 0; i < a; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			ary[i] = n1 + n2;
		}
		for (int i = 0; i < a; i++) {
			System.out.println(ary[i]);
		}
	}
}