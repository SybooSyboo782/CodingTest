// 가장 가까운 같은 글자 https://school.programmers.co.kr/learn/courses/30/lessons/142086
class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        
        answer[0] = -1;
        
        for(int i = 0; i < s.length(); i++) {
            
            answer[i] = -1;
            
            for(int j = i - 1; j >= 0; j--) {
                
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}