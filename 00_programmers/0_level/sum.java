// 두 수의 합 https://school.programmers.co.kr/learn/courses/30/lessons/181846
import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        
        String answer = sum.toString();
        // https://coding-factory.tistory.com/604 참고
        
        return answer;
    }
}