// 문자열 묶기 https://school.programmers.co.kr/learn/courses/30/lessons/181855
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        int[] count = new int[100000];
        
        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }
        
        return Arrays.stream(count).max().getAsInt();
    }
}