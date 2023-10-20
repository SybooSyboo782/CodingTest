// 문자열 바꿔서 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/181864?language=java
class Solution {
    public int solution(String myString, String pat) {
        
        String replacedString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        if (replacedString.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}