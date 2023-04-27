// 프로그래머스 짝수와 홀수 문제 풀기
// https://school.programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public String solution(int num) {
        
        String answer = "";
        
        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        
        return answer;
    }
}