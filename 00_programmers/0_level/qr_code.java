// qr code https://school.programmers.co.kr/learn/courses/30/lessons/181903
import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        
        int rest;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            rest = i % q;
            
            if (rest == r) {
                answer.append(code.charAt(i));
            } else {;}
        }
        return answer.toString();
    }
}