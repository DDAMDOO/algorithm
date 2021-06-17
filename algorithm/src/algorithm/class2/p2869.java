package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869 {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int v = sc.nextInt();
//		int cnt = 0;

//		case1		
//		for (;;) {
//			cnt++;
//			v -= a;
//			if (v <= 0) {
//				System.out.println(cnt);
//				return;
//			} else {
//				v += b;
//			}
//		}

//		case2		
//		cnt = (v-b)/(a-b);
//		if ((v - b) % (a - b) != 0) {
//			cnt++;
//		}
//		System.out.println(cnt);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int cnt = 0;

		cnt = (v - b) / (a - b);

		if ((v - b) % (a - b) != 0) {
			cnt++;
		}
		System.out.println(cnt);
	}
}