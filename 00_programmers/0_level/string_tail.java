// 꼬리 문자열 https://school.programmers.co.kr/learn/courses/30/lessons/181841
class Solution {
    public String solution(String[] str_list, String ex) {
        
        String answer = "";
        
        for(int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        
        return answer;
    }
}