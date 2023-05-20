// 나누어 떨어지는 숫자 배열 https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;
            }
        }
        
        if(count == 0 ) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        int num = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[num] = arr[i];
                num++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}