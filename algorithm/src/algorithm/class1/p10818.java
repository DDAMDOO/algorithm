package algorithm.class1;

import java.util.Scanner;

public class p10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		int [] ary = new int[a];
		for (int i = 0; i < a; i++) {
			ary[i] = sc.nextInt();
			if(ary[i] > max) {
				max = ary[i];
			}
			if(ary[i] < min) {
				min = ary[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}