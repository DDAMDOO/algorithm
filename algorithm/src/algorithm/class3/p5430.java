package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p5430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < T; i++) {
			list.clear();
			boolean flag = false;
			boolean isReverse = false;
			String[] func = br.readLine().split("");
			int a = Integer.parseInt(br.readLine());
			
			if (a >= 0) {
				String s = br.readLine();
				s = s.substring(1, s.length() - 1);

				StringTokenizer st = new StringTokenizer(s, ",");

				for (int j = 0; j < a; j++) {
					list.add(st.nextToken());
				}
				for (int j = 0; j < func.length; j++) {
					if (func[j].equals("R")) {
						isReverse = !isReverse;
					} else if (func[j].equals("D")) {
						if (list.size() == 0) {
							flag = true;
							break;
						}
						if (isReverse) {
							list.remove(list.size() - 1);
						} else {
							list.remove(0);
						}
					}
				}
				if (list.size() > 0) {
					sb.append("[");
					if(isReverse) {
						sb.append(list.get(list.size()-1));
						for (int j = list.size()-2; j >=0;j--) {
							sb.append("," + list.get(j));
						}
					} else {
						sb.append(list.get(0));
						for (int j = 1; j < list.size(); j++) {
							sb.append("," + list.get(j));
						}						
					}
					sb.append("]\n");
				} else if (list.size() == 0 && flag == false) {
					sb.append("[]\n");
				} else {
					sb.append("error\n");
				}
			}
		}
		System.out.print(sb);
	}
}