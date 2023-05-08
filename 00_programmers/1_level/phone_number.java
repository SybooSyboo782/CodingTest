// 핸드폰 번호 가리기 https://school.programmers.co.kr/learn/courses/30/lessons/12948

class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        
        for(int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        
        String temp = "";
        
        for(int i = 0; i < 4; i++) {
            temp += (phone_number.charAt(phone_number.length() - 4 + i));
        }
        
        answer += temp;
        
        return answer;
    }
}