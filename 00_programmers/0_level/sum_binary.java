// 이진수 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/120885
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int result = num1 + num2;
        
        answer = Integer.toBinaryString(result);
        
        return answer;
    }
}