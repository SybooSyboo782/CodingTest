// 문자열 내 p와 y의 개수 https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCount = 0;
        int yCount = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == 'p') {
                pCount++;
            } else if(s.charAt(i) == 'y') {
                yCount++;
            }
        }
        
        if(pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}