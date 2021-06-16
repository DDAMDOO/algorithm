package algorithm.class2;

import java.util.Scanner;

public class p15829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		long b = 1;
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += (int) (s.charAt(i) - 96) * b;
			b *= 31;
			b = b % 1234567891;
			sum = sum % 1234567891;
		}
		System.out.println(sum);
	}
}