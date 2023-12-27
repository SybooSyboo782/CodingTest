// 합성수 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/120846
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j ++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    answer ++;
                    break;
                }
            }
        }
        return answer;
    }
}