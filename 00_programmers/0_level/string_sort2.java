// 문자열 정렬하기 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120911
import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        String lower_String = my_string.toLowerCase(); 
        
        char[] charArray = lower_String.toCharArray();
        
        Arrays.sort(charArray);
        
        String answer = new String(charArray);
        
        return answer;
    }
}