// 대문자와 소문자 https://school.programmers.co.kr/learn/courses/30/lessons/120893
class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            } else {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }
        }
        
        return answer;
    }
}
