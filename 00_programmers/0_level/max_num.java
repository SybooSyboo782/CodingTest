// 최댓값 만들기 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120862?language=java
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int answer = numbers[0] * numbers[1];
        int answer2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if(answer < answer2) {
            answer = answer2;
        }
        
        return answer;
    }
}