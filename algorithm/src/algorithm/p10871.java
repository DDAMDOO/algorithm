package algorithm;

import java.util.Scanner;

public class p10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int[] ary = new int[a];
		for (int i = 0; i < a; i++) {
			ary[i] = sc.nextInt();
		}
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] < n) {
				System.out.println(ary[i]);
			}
		}
	}
}
