// 최댓값 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/120847
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int len = numbers.length - 1;
        int answer = numbers[len] * numbers[len-1];
        
        return answer;
    }
}
