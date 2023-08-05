// 배열 두배 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/120809
class Solution {
    public int[] solution(int[] numbers) {
        
        int n_length = numbers.length;
        int[] answer = new int[n_length];
        
        for(int i = 0; i < n_length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}