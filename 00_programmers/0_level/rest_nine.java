// 9로 나눈 나머지 https://school.programmers.co.kr/learn/courses/30/lessons/181914
class Solution {
    public int solution(String number) {
        
        int numLength = number.length();
        int answer = 0;
        
        for (int i = 0; i < numLength; i++) {
            answer += Character.getNumericValue(number.charAt(i));
        }
        
        answer %= 9;
        
        return answer;
    }
}