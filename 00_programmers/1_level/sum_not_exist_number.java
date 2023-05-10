//없는 숫자 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/86051

class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
        int total = 0;
        
        for(int i = 0; i < 10; i++) {
            answer += i;
        }
        
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        
        answer -= total;
        
        return answer;
    }
}