// 문자열의 뒤의 n글자 https://school.programmers.co.kr/learn/courses/30/lessons/181910
class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";
        int nLength = my_string.length() - n;
        
        for(int i = nLength; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}