// 제곱수 판별하기 https://school.programmers.co.kr/learn/courses/30/lessons/120909
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}