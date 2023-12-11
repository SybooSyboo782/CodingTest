// 배열 만들기 3 https://school.programmers.co.kr/learn/courses/30/lessons/181895
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++ ) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                intList.add(arr[j]);
            }
        }
        
        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}