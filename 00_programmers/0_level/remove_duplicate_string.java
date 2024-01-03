// 중복된 문자 제거 https://school.programmers.co.kr/learn/courses/30/lessons/120888

import java.util.*;
class Solution {
    public String solution(String my_string) {
        int length;
        if (my_string == null 
                || my_string.isBlank()) {
            return my_string;
        } else {
             length = my_string.length();
        }
        
        StringBuilder sb = new StringBuilder(length);
        Set<Character> set = new LinkedHashSet<>(length);
        
        for (char c : my_string.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}