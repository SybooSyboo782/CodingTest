// 두 정수 사이의 합 https://school.programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        }
        
        return answer;
    }
}