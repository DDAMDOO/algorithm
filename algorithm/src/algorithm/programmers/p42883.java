package algorithm.programmers;

public class p42883 {

	class Solution {
	    public String solution(String number, int k) {
	        StringBuilder answer = new StringBuilder();
	        int idx = 0;
			int max = 0;
			for (int i = 0; i < number.length() - k; i++) {
				max = 0;
				for (int j = idx; j <= i + k; j++) {
					if (max < number.charAt(j) - '0') {
						max = number.charAt(j) - '0';
						idx = j + 1;
					}
				}
				answer.append(max);
			}
	        
	        return answer.toString();
	    }
	}
}