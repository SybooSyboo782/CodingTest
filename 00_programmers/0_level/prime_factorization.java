// 소인수분해 https://school.programmers.co.kr/learn/courses/30/lessons/120852
import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (false == answer.contains(i)) {
                    answer.add(i);
                } else {;}
                
                n /= i;
            }
        }
        
        return answer;
    }
}