// 피자 나눠 먹기 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120815
class Solution {
    public int solution(int n) {
        
        int pizza = 1;
        
        while ( ((pizza * 6) % n) != 0) {
            pizza += 1;
        }
        
        
        return pizza;
    }
}