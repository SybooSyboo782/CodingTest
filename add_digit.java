// 자릿수 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/120906?language=java
class Solution {
    public int solution(int n) {
        
        String str = Integer.toString(n);
        int answer = 0;
        
        for(int i = 0; i < str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }
        
        return answer;
    }
}
