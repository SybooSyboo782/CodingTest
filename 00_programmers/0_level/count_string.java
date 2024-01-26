// 문자열이 몇 번 등장하는지 세기 https://school.programmers.co.kr/learn/courses/30/lessons/181871
class Solution {
    public int solution(String myString, String pat) {
        
        int answer = 0;
        int myLength = myString.length();
        
        int pLength = pat.length();
        int length = myLength - pLength;
        
        StringBuilder sb = new StringBuilder(myString);
        
        for (int i = 0; i <= length; i++) {
            if ((sb.substring(i, i + pLength).equals(pat))) {
                answer++;
            } else {;}
        }
        return answer;
    }
}