// 수 조작하기 2 https://school.programmers.co.kr/learn/courses/30/lessons/181925
class Solution {
    public String solution(int[] numLog) {
        
        int numLength = numLog.length;
        String answer = "";
        
        for (int i = 1; i < numLength; i++) {
            int temp = numLog[i - 1] - numLog[i];
            if (1 == temp) {
                answer += "s";
            } else if (-1 == temp) {
                answer += "w";
            } else if (10 == temp) {
                answer += "a";
            } else if (-10 == temp) {
                answer += "d";
            } else {
                ;
            }
        }
        return answer;
    }
}