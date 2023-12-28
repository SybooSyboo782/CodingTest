// 세로 읽기 https://school.programmers.co.kr/learn/courses/30/lessons/181904
class Solution {
    public String solution(String my_string, int m, int c) {
        
        int length = my_string.length();
        String answer = "";
        
        for(int i = c - 1; i < length; i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}