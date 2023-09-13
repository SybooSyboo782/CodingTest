// 조건에 맞게 수열 변환하기 3 https://school.programmers.co.kr/learn/courses/30/lessons/181835
class Solution {
    public int[] solution(int[] arr, int k) {
        
        int a_length = arr.length;
        int[] answer = new int [a_length];
        
        for(int i = 0; i < a_length; i++) {
            if(k % 2 == 0) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }
}