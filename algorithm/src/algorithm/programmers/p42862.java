package algorithm.programmers;

public class p42862 {

	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int [] ary = new int [n];
	        
	        for(int i=0;i<lost.length;i++){
	            ary[lost[i]-1]--;
	        }
	        
	        for(int i=0;i<reserve.length;i++){
	            ary[reserve[i]-1]++;
	        }
	        
	        for(int i=0;i<n;i++){
	            if(ary[i]<0){
	                if (i != n - 1 && ary[i + 1] > 0) {
	                    ary[i]++;
	                    ary[i + 1]--;
	                } else if (i != 0 && ary[i - 1] > 0) {
	                    ary[i]++;
	                    ary[i - 1]--;
	                }
	            }
	        }       
	        
	        for(int i=0;i<n;i++){
	            if(ary[i] >= 0){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}

}
