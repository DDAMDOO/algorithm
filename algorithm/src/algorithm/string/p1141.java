package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p1141 {
	static int N;
    static String[] ary;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ary = new String[N];
        
        // Input Strings
        for(int i = 0; i < N; i++) {
            ary[i] = br.readLine();
        }
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0 ; i < N; i++) {
            String origin = ary[i];
            int cnt = 0;
            for(int j = 0; j < N; j++) {
                // If not same,
                if(i != j) {
                    String comp = ary[j];
                    if(origin.length() <= comp.length()) {
                        for(int k = 0; k < origin.length(); k++) {
                            if(origin.equals(comp)) {
                                cnt++;
                                break;
                            }
                            if(origin.charAt(k) != comp.charAt(k)) {
                                cnt++;
                                break;
                            }
                        }
                    } else {
                        cnt++;
                    }
                }
            }
            if(cnt == N - 1) {
                set.add(origin);
            }
        }
        System.out.println(set.size());
    }
}
