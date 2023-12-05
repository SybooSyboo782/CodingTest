// 특별한 이차원 배열 1 https://school.programmers.co.kr/learn/courses/30/lessons/181833

class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
    }
}