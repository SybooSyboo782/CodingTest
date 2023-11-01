// 개미 군단 https://school.programmers.co.kr/learn/courses/30/lessons/120837
class Solution {
    public int solution(int hp) {
        return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
    }
}