package algorithm;

import java.util.Scanner;

public class p10952 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1 == 0 && n2 == 0) {
				return;
			} else {				
				System.out.println(n1 + n2);
			}
		}
	}
}
