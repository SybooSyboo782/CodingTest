// 정수 제곱근 판별 https://school.programmers.co.kr/learn/courses/30/lessons/12934

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double doubleSqrt = Math.sqrt(n);
        int integerSqrt = (int)doubleSqrt;
        
        if(doubleSqrt == integerSqrt) {
            answer = (long)Math.pow((integerSqrt + 1), 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}