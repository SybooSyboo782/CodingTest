// 특별한 이차원 배열 2 https://school.programmers.co.kr/learn/courses/30/lessons/181831
class Solution {
    public int solution(int[][] arr) {
        
        int answer = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length / 2; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return answer;
    }
}