// 중앙값 구하기 https://school.programmers.co.kr/learn/courses/30/lessons/120811

import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        int answer = array[array.length / 2];
        
        return answer;
    }
}