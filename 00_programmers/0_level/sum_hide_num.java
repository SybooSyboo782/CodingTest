// 숨어있는 숫자의 덧셈 (1) https://school.programmers.co.kr/learn/courses/30/lessons/120851
class Solution {
    public int solution(String my_string) {

        int answer = 0;

        for(int i = 0; i < my_string.length(); i++) {
            if(0 <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                answer += my_string.charAt(i) - '0';
            }
        }

        return answer;
    }
}