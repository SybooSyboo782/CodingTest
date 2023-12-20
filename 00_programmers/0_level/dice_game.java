// 주사위 게임 2 https://school.programmers.co.kr/learn/courses/30/lessons/181930
class Solution {
    public int solution(int a, int b, int c) {
        
        int answer = 1;
        
        if (a == b && b == c) {
            for(int i = 1; i <= 3; i ++) {
                answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
            }
            return answer;
            
        } else if((a == b && b != c) || (a == c && c != b) || (a != b && b == c) ) {
            for(int i = 1; i <= 2; i ++) {
                answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
            }
            return answer;
        } else {
            return a + b + c;
        }
    }
}