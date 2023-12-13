// 문자 리스트를 문자열로 변환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181941
class Solution {
    public String solution(String[] arr) {
        
        int a_length = arr.length;
        String answer = "";
        
        for(int i = 0; i < a_length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}