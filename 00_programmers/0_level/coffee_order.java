// 커피 심부름 https://school.programmers.co.kr/learn/courses/30/lessons/181837
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int order_length = order.length;
        
        for (int i = 0; i < order_length; i++) {
            if(order[i].contains("americano") || order[i].equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        
        return answer;
    }
}