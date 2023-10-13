// 배열 만들기 1 https://school.programmers.co.kr/learn/courses/30/lessons/181901?language=java
class Solution {
    public int[] solution(int n, int k) {
        
        int length = n / k;
        
        System.out.print(length);
        
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            answer[i] = k * (i + 1);
        }
        
        return answer;
    }
}