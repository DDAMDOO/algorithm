package algorithm.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p2407 {
    static BigInteger[][] ary;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ary = new BigInteger[101][101];
        combination(a, b);

        System.out.println(ary[a][b]);
    }

    public static void combination(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    ary[i][j] = new BigInteger("1");
                } else {
                    ary[i][j] = ary[i - 1][j - 1].add(ary[i - 1][j]);
                }
            }
        }
    }
}
