// 2의 영역 https://school.programmers.co.kr/learn/courses/30/lessons/181894
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = 100000;
        int max = 0;
        int a_length = arr.length;
        
        for (int i = 0; i < a_length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        if (min <= max) {
            return Arrays.copyOfRange(arr, min, max + 1);
        } else {
            return new int[]{-1};
        }
    }
}