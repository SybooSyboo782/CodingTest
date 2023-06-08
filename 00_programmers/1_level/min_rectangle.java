// 최소직사각형 https://school.programmers.co.kr/learn/courses/30/lessons/86491

class Solution {
    public int solution(int[][] sizes) {

        int max_width = -1;
        int min_height = -1;

        for(int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            if(max > max_width) {
                max_width = max;
            }
            if(min > min_height) {
                min_height = min;
            }

        }

        return max_width * min_height;
    }
}