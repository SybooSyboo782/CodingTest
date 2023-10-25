// 0 떼기 https://school.programmers.co.kr/learn/courses/30/lessons/181847
class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean isZero = true;
        
        for (char c : n_str.toCharArray()) {
            if (c == '0' && isZero) {
                continue;
            }
            
            isZero = false;
            answer += c;
        }
        
        return answer;
    }
}