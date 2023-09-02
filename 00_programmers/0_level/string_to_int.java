// 문자열을 정수로 변환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181848
class Solution {
    public int solution(String n_str) {
        int answer = 0;
        
        try{
            answer = Integer.parseInt(n_str);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        return answer;
    }
}