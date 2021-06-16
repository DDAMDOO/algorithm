package algorithm;

import java.util.Scanner;

public class p2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] ary = new int[8];
		int idx = 0;
		for (int i = 0; i < 8; i++) {
			ary[i] = sc.nextInt();
			if (i != 0) {
				if (ary[i] - ary[i - 1] > 0) {
					idx++;
				} else {
					idx--;
				}
			}
		}
		if(idx == 7) {
			System.out.println("ascending");
		} else if(idx == -7) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
