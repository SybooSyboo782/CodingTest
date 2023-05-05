// 자연수 뒤집어 배열로 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12932

class Solution {
    public int[] solution(long n) {
        
        String arrayNum = String.valueOf(n);
        
        StringBuffer sb = new StringBuffer(arrayNum);
        String reverseStr = sb.reverse().toString();
        
        int[] answer = new int[arrayNum.length()];
        
        for(int i = 0; i < reverseStr.length(); i++) {
            
            answer[i] = reverseStr.charAt(i) - '0';
            
        }
        
        return answer;
    }
}