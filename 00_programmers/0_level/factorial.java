// 팩토리얼 https://school.programmers.co.kr/learn/courses/30/lessons/120848
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n) {
                answer = i;
            } else {;}
        }
        
        return answer;
    }
    private int factorial(int n) {
        return (n <= 1) ? n : factorial(n - 1) * n;
    }
}