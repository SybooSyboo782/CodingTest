// n보다 커질 때까지 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/181884?language=java
class Solution {
    public int solution(int[] numbers, int n) {
        
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if(answer <= n) {
                answer += numbers[i];
            }
            else {
                return answer;
            }
        }
        
        return answer;
    }
}