// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/181872?language=java
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLength = pat.length();
        int myStringLength = myString.length();

        for (int i = myStringLength - 1; i >= 0; i--) {
            String substr = myString.substring(0, i + 1);
            if (substr.endsWith(pat)) {
                answer = substr;
                break;
            }
        }

        return answer;
    }
}