package algorithm;

import java.util.Scanner;

public class p11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			sum += (int) (s.charAt(i) - 48);
		}
		System.out.println(sum);
	}
}