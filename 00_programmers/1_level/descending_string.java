// 문자열 내림차순으로 배치하기 https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String a : str)
           answer += a;
        
        return answer;
    }
}