// 뒤에서 5등 위로 https://school.programmers.co.kr/learn/courses/30/lessons/181852
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        
        return answer;
    }
}