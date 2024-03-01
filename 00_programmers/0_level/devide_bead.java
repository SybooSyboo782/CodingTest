// 구슬을 나누는 경우의 수 https://school.programmers.co.kr/learn/courses/30/lessons/120840
class Solution {
    public int solution(int balls, int share) {
        return official(balls, share);
    }

    public static int official(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }
        
        return official((balls - 1), (share - 1)) + official(balls - 1, share);
    }
}