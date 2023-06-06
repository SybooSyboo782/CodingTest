// x 사이의 개수 https://school.programmers.co.kr/learn/courses/30/lessons/181867

import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        String[] arr = myString.split("x", -1);
        
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        
        return answer;
    }
}