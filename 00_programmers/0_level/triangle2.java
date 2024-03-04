// 삼각형의 완성조건 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120868
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxNum = Math.max(sides[0], sides[1]);
        int minNum = Math.min(sides[0], sides[1]);
        int num = maxNum + 1 - minNum;
        for (int i = num; i <= maxNum; i++){
            answer++; 
        }
        
        int cnt = answer - 1;
        return answer + cnt;
    }
}