// 배열 만들기 5 https://school.programmers.co.kr/learn/courses/30/lessons/181912
import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) {
                result.add(i);
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}