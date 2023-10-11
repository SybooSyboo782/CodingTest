// 더 크게 합치기 https://school.programmers.co.kr/learn/courses/30/lessons/181939
class Solution {
    public int solution(int a, int b) {        
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int abValue = Integer.parseInt(ab);
        int baValue = Integer.parseInt(ba);
        
        if (abValue >= baValue) {
            return abValue;
        } else {
            return baValue;
        }
    }
}