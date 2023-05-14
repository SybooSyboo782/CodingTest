// 정수 내림차순으로 배치하기 https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] arr = Long.toString(n).split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String str = "";
        
        for (String s : arr) {
            str += s;
        }
        
        answer = Long.parseLong(str);
        
        return answer;
    }
}