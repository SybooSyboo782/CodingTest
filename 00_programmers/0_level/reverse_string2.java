// 문자열 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/181905

class Solution {
    public String solution(String my_string, int s, int e) {
        
        String str = my_string.substring(s,e+1);
        
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        
        String answer = my_string.replaceAll(str, reversedStr);
        
        return answer;
    }
}