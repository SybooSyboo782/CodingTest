// 길이에 따른 연산 https://school.programmers.co.kr/learn/courses/30/lessons/181879
class Solution {
    public int solution(int[] num_list) {

        int nLength = num_list.length;
        int answer = 0;

        if(nLength <= 10) {
            answer = 1;

            for(int i = 0; i < nLength; i++) {
                answer *= num_list[i];
            }
            return answer;
        }

        if(nLength >= 11) {
            for(int i = 0; i < nLength; i++) {
                answer += num_list[i];
            }

            return answer;
        }

        return answer;
    }
}