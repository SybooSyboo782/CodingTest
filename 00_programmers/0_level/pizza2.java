// 피자 나눠 먹기 (3) https://school.programmers.co.kr/learn/courses/30/lessons/120816
class Solution {
    public int solution(int slice, int n) {

        double answer = Math.ceil((double)n / slice);

        return (int)answer;
    }
}