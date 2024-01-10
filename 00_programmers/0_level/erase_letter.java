// 글자 지우기 https://school.programmers.co.kr/learn/courses/30/lessons/181900
class Solution {
    public String solution(String my_string, int[] indices) {
        int indices_length = indices.length;
        String answer = "";
        
        String[] temp = my_string.split("");
        
        for (int i = 0; i < indices_length; i++) {
            temp[indices[i]] = "";
        }

        for (String s : temp) {
            answer += s;
        }
        
        return answer;
    }
}