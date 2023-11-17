// 콜라츠 수열 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/181919
import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);
        }

        int[] answer = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }
        
        return answer;
    }
}