package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();

		int a = Integer.parseInt(br.readLine());

		for (int i = 1; i <= a; i++) {
			q.add(i);
		}

		while(q.size() > 1) {
			q.poll();
			int k = q.poll();
			q.add(k); 
		}
		
		System.out.println(q.poll());
	}
}