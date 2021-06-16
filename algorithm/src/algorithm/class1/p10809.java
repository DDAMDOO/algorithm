package algorithm.class1;

import java.util.Scanner;

public class p10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int[] alpha = new int[26];

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}
		for (int i = 0; i < s.length(); i++) {
			if(alpha[(int)(s.charAt(i)) - 97] == -1) {
				alpha[(int)(s.charAt(i)) - 97] = i;
			}
		}
		for(int i=0;i<alpha.length;i++){
			System.out.println(alpha[i]);
		}
	}
}