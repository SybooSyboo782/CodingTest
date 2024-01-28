// 배열의 길이를 2의 거듭제곱으로 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/181857

import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int targetLength = 1;
        
        while (targetLength < arrLength) {
            targetLength *= 2;
        }
        
        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);
        
        System.arraycopy(arr, 0, answer, 0, arrLength);
        
        return answer;
    }
}