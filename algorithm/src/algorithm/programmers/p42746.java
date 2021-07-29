package algorithm.programmers;

import java.util.*;

public class p42746 {
	class Solution {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			for (int i = 0; i < commands.length; i++) {
				int[] ary = new int[commands[i][1] - commands[i][0] + 1];
				for (int j = 0; j < ary.length; j++) {
					ary[j] = array[commands[i][0] - 1 + j];
				}
				Arrays.sort(ary);
				answer[i] = ary[commands[i][2] - 1];
			}
			return answer;
		}
	}
}