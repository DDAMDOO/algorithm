package algorithm.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] ary = new int[10001];
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			ary[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 1; i <= 10000; i++) {
			if (ary[i] > 0) {
				for (int j = 0; j < ary[i]; j++) {
					bw.write(i + "\n");
				}
			}
		}
		bw.close();
	}
}
