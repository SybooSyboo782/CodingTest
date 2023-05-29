// 최대공약수와 최소공배수 https://school.programmers.co.kr/learn/courses/30/lessons/12940

class Solution {
    public int[] solution(int n, int m) {
        
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        int[] answer = { a, n * m / a };
        
        return answer;
    }
}