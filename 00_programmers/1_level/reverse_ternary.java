// 3진법 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
    public int solution(int n) {

        String answer = "";

        while(n != 0) {
            answer += n % 3;
            n /= 3;
        }

        return Integer.parseInt(answer, 3);
    }
}