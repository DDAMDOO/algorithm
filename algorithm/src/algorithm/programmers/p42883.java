package algorithm.programmers;

public class p42883 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1924";
		int k=2;
		String answer = "";
		for(int i=0;i<number.length()-k;i++) {
			number.substring(i, number.length()-k+i);
		}
	}

}
