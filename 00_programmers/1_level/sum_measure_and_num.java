// 약수의 개수와 덧셈 https://school.programmers.co.kr/learn/courses/30/lessons/77884
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int measure_count = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) { 
                    measure_count++;
                }
            }
            
            if(measure_count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}