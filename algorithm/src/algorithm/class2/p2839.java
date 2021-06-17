package algorithm.class2;

import java.util.Scanner;

public class p2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 99999;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				int k = a;
				k -= i * 5;
				k -= j * 3;
				if (k == 0) {
					if (max >= i + j) {
						max = i + j;
					}
				}
			}
		}
		if(max == 99999) {
			System.out.println("-1");
		} else {
			System.out.println(max);
		}
	}
}