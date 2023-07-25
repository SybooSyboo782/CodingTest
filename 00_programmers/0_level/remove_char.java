// 특정 문자 제거하기 https://school.programmers.co.kr/learn/courses/30/lessons/120826
class Solution {
    public String solution(String my_string, String letter) {
        
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}