package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p18870 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}

		int[] arySorted = ary.clone();
		Arrays.sort(arySorted);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < arySorted.length; i++) {
			if (!map.containsKey(arySorted[i])) {
				map.put(arySorted[i], cnt++);
			}
		}

		for (int i = 0; i < a; i++) {
			sb.append(map.get(ary[i]) + " ");
		}
		
		System.out.println(sb);
	}
}