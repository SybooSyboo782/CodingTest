// 숫자 문자열과 영단어 https://school.programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    public int solution(String s) {
        
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
            if(s.contains(word[i])) {
                s = s.replace(word[i], Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
        
    }
}