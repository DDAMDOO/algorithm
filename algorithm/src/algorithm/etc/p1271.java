package algorithm.etc;

import java.math.BigInteger;
import java.util.Scanner;

public class p1271 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.divide(b));
		System.out.println(a.mod(b));
	}
}