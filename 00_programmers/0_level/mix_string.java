// 문자열 섞기 https://school.programmers.co.kr/learn/courses/30/lessons/181942
class Solution {
    public String solution(String str1, String str2) {
        
        int length = str1.length();
        String answer = "";
        
        for(int i = 0; i < length; i++){
            answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
        }
        
        return answer;
    }
}