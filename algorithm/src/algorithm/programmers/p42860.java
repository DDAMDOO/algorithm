package algorithm.programmers;

public class p42860 {

	class Solution {
	    public int solution(String name) {
	        int answer = 0;
	        int min = name.length() - 1;

			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i) - 'A' < 'Z' - name.charAt(i) + 1) {
					answer+= (name.charAt(i) - 'A');
				} else {
					answer += ('Z' - name.charAt(i) + 1);
				}

				int nextIndex = i + 1;
				while (nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
					nextIndex++;
				}
				min = Math.min(min, (i * 2) + name.length() - nextIndex);
			}
	        answer += min;
	        return answer;
	    }
	}
}
