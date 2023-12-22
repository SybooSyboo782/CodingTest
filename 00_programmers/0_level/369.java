// 369게임 https://school.programmers.co.kr/learn/courses/30/lessons/120891
class Solution {
    public int solution(int order) {
        
        int answer = 0;
        int restNum = 0;
        
        while (order > 0) {
            restNum = order % 10;
            
            if(restNum != 0 && restNum % 3 == 0) {
                answer ++;
            }
            
            order /= 10;
        }
        return answer;
    }
}