// 점의 위치 구하기 https://school.programmers.co.kr/learn/courses/30/lessons/120841
class Solution {
    public int solution(int[] dot) {

        if(0 <= dot[0]) {
            if(0 <= dot[1]) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if(0 <= dot[1]) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}