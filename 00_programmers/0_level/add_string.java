// 숨어있는 숫자의 덧셈 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120864
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for (String s : str) {
            if (false == s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}