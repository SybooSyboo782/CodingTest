
// 2차원으로 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/120842
class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int list_length = num_list.length;
        
        int[][] answer = new int[list_length / n][n];
        int count = 0;
        
        for (int i = 0, answer_length = answer.length; i < answer_length; i++) {
            for (int j = 0, answer_ILength = answer[i].length; j < answer_ILength; j++, count++) {
                answer[i][j] = num_list[count];
            }
        }
        
        return answer;
    }
}