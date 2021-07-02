package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		
		int b = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			System.out.println(Integer.parseInt(st.nextToken()));
			int cnt = Arrays.binarySearch(ary, Integer.parseInt(st.nextToken()));
			
			if(cnt == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
	}

}
