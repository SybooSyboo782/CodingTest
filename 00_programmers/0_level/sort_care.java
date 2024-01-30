// 진료 순서 정하기 https://school.programmers.co.kr/learn/courses/30/lessons/120835
class Solution {
    public int[] solution(int[] emergency) {
        
        int e_length = emergency.length;
        int[] answer = new int[e_length];
        
        for (int i = 0; i < e_length; i++) {
            for (int j = 0; j < e_length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        
        return answer;
    }
}