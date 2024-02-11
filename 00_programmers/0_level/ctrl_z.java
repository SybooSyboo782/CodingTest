// 컨트롤 제트 https://school.programmers.co.kr/learn/courses/30/lessons/120853
class Solution {
    public int solution(String s) {
        
        String[] list = s.split(" ");
        int list_length = list.length;
        int answer = 0;
        
        for (int i = 0 ; i < list_length; i++){
            if (list[i].equals("Z")) {
                answer -= Integer.parseInt(list[i - 1]);  
            } else {
                answer += Integer.parseInt(list[i]);
            }
        }
        
        return answer;
    }
}