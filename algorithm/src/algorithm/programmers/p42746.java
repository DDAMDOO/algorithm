package algorithm.programmers;

import java.util.*;

public class p42746 {
	class Solution {
	    public String solution(int[] numbers) {
	        String answer = "";
	        
	        String [] ary = new String[numbers.length];
	        
	        for(int i=0;i<ary.length;i++){
	            ary[i] = Integer.toString(numbers[i]);
	        }
	        
	        Arrays.sort(ary, new Comparator<String>(){
	            @Override 
	             public int compare(String a, String b) {
	                return (b+a).compareTo(a+b);
	             }
	        });
	        if(ary[0].equals("0")){
	            return "0";
	        }
	        for(int i=0;i<ary.length;i++){
	            answer+=ary[i];
	        }
	        return answer;
	    }
	}
}