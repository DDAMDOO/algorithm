package algorithm.programmers;

import java.util.ArrayList;

public class p42840 {
	class Solution {
	    public int[] solution(int[] answers) {        
	        int[] ary1 = {1, 2, 3, 4, 5};
	        int[] ary2 = {2, 1, 2, 3, 2, 4, 2, 5};
	        int[] ary3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	        
	        int ans1=0;
	        int ans2=0;
	        int ans3=0;

	        for(int i=0;i<answers.length;i++){
	            if(answers[i] == ary1[i%5]){
	                ans1++;
	            }
	            if(answers[i] == ary2[i%8]){
	                ans2++;
	            }
	            if(answers[i] == ary3[i%10]){
	                ans3++;
	            }

	        }
	        int max = Math.max(ans1, Math.max(ans2, ans3));
	        ArrayList<Integer> list = new ArrayList<>();
	        if(max == ans1){
	            list.add(1);
	        }
	        if(max == ans2){
	            list.add(2);
	        }
	        if(max == ans3){
	            list.add(3);
	        }
	        int[] answer = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            answer[i] = list.get(i);
	        }
	        return answer;
	    }
	}
}
