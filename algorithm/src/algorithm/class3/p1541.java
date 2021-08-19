package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split("-");

		int rst = 0;
		boolean flag = false;
		for (int i = 0; i < s.length; i++) {
			int sum = 0;
			String[] add = s[i].split("\\+");

			for (int j = 0; j < add.length; j++) {
				sum += Integer.parseInt(add[j]);
			}

			if (flag == false) {
				rst = sum;
				flag = true;
			} else {
				rst -= sum;
			}
		}
		System.out.println(rst);
	}
}