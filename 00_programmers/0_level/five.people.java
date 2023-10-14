// 5명씩 https://school.programmers.co.kr/learn/courses/30/lessons/181886
class Solution {
    public String[] solution(String[] names) {
        
        int length;
        
        if(names.length % 5 == 0) {
            length = (names.length / 5);
        } else {
            length = (names.length / 5) + 1;
        }
        
        String[] answer = new String[length];
        
        for(int i = 0; i < length; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}