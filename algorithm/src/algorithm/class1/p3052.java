package algorithm;

import java.util.Scanner;

public class p3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		int[] cnt = new int[42];
		int rst = 0;
		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
			cnt[input[i] % 42]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				rst++;
			}
		}
		System.out.println(rst);
	}
}