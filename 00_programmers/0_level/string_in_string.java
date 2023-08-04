// 문자열안에 문자열 https://school.programmers.co.kr/learn/courses/30/lessons/120908
class Solution {
    public int solution(String str1, String str2) {

        int answer = 0;
        int temp = 0;
        temp = str1.indexOf(str2);

        if(temp == -1) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }
}