// 문자열 겹쳐쓰기 https://school.programmers.co.kr/learn/courses/30/lessons/181943
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        } else {;}
        return answer;
    }
}