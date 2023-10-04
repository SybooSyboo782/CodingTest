// 배열의 원소만큼 추가하기 https://school.programmers.co.kr/learn/courses/30/lessons/181861
class Solution {
    public int[] solution(int[] arr) {
    
        int length = 0;
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            length += arr[i];
        }
        
        int[] answer = new int[length];
        
        for(int i = 0; i < arr.length; i++) {
            
            for(int j = 0; j < arr[i]; j++) {
                answer[count] = arr[i];
                count++;
            }
        }        return answer;
    }
}
