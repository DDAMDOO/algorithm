package algorithm.etc;

import java.math.BigInteger;

public class bigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bi = new BigInteger("123");
		BigInteger bi1 = new BigInteger("12345");
		
		System.out.println(bi.add(bi1));
		System.out.println(bi.subtract(bi1));
		System.out.println(bi.multiply(bi1));
		System.out.println(bi.divide(bi1));
		System.out.println(bi.remainder(bi1));
		
		BigInteger [] ary = new BigInteger[3];
		
		ary[0] = BigInteger.ONE;
		ary[1] = BigInteger.ZERO;
		ary[2] = BigInteger.TEN;
		
		for(int i=0;i< ary.length;i++) {
			System.out.println(ary[i]);
		}
	}

}
