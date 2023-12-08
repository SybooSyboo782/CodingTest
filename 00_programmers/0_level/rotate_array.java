// 배열 회전시키기 https://school.programmers.co.kr/learn/courses/30/lessons/120844
class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int n_length = numbers.length - 1;
        
        int[] answer = new int[n_length + 1];
        
        if ("right".equals(direction)) {
            
            answer[0] = numbers[n_length];
            
            for (int i = 0; i < n_length; i++) {
                answer[i + 1] = numbers[i]; 
            }
        } else {
            
            answer[n_length] = numbers[0];
            
            for (int i = 0; i < n_length; i++) {
                answer[i] = numbers[i + 1]; 
            }
            
        }
        
        return answer;
    }
}