// 양꼬치 https://school.programmers.co.kr/learn/courses/30/lessons/120830
class Solution {
    public int solution(int n, int k) {

        int answer = n * 12000;

        if(n / 10 > 0) {
            k -= n / 10;
        }

        answer += k * 2000;

        return answer;
    }
}