package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p2751 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>(); 

		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);;
		
		for (int i = 0; i < a; i++) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);
	}
}