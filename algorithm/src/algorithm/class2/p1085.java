package algorithm.class2;

import java.util.Scanner;

public class p1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int rst = 1000;
		if (Math.abs(x - w) < rst) {
			rst = Math.abs(x - w);
		}
		if (Math.abs(x) < rst) {
			rst = Math.abs(x);
		}
		if (Math.abs(y - h) < rst) {
			rst = Math.abs(y - h);
		}
		if (Math.abs(y) < rst) {
			rst = Math.abs(y);
		}
		System.out.println(rst);
	}
}