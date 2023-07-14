// 소수 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/12921
// 에라토스테네스의 체 참고 https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4

class Solution {
    public int solution(int n) {

        int answer = 0;
        int[] number = new int[n+1];

        for(int i = 2; i <= n; i++) {
            number[i] = i;
        }

        for(int i = 2; i <= n; i++) {
            if(number[i] == 0) {
                continue;
            }

            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }

        for(int i = 0, n_length = number.length; i < n_length; i++) {
            if(number[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}