package algorithm.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+ "\n");
		}
		System.out.println(sb);
	}
}