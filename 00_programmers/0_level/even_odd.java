// 홀수 vs 짝수 https://school.programmers.co.kr/learn/courses/30/lessons/181887
class Solution {
    public int solution(int[] num_list) {
        
        int odd = 0;
        int even = 0;
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        
        if(odd < even) {
            answer = even;
        } else {
            answer = odd;
        }
        
        return answer;
    }
}