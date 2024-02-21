// 문자 개수 세기 https://school.programmers.co.kr/learn/courses/30/lessons/181902
class Solution {
    public int[] solution(String my_string) {
        
        int alpha = 26;
        int[] answer = new int[2 * alpha];
        
        for (int i = 0 ; i < my_string.length() ; i++){
            char ch = my_string.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                answer[ch - 'a' + alpha]++;
            }
            if (ch >= 'A' && ch <= 'Z'){
                answer[ch - 'A']++;
            }
        }
        return answer;
    }
}