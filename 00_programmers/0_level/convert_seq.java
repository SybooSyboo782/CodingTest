// 조건에 맞게 수열 변환하기 2 https://school.programmers.co.kr/learn/courses/30/lessons/181881
import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            int[] temp = arr.clone();
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else {
                    ;
                }
            }
            
            if(Arrays.equals(arr, temp)) {
                break;
            }
            
            answer++;
        }
            
        return answer;
        
    }
}