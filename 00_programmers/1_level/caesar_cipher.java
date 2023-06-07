// 시저 암호 https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {

        String answer = "";

        for(int i = 0; i < s.length(); i++) {

            char temp = s.charAt(i);

            if('A' <= temp && temp <= 'Z'){
                if('Z' < temp + n) {
                    temp += n - 26;
                } else {
                    temp += n;
                }
            }

            else if('a' <= temp && temp <= 'z'){
                if('z' < temp + n) {
                    temp += n - 26;
                } else {
                    temp += n;
                }
            }

            answer += temp;
        }
        return answer;
    }
}