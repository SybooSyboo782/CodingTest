// 카운트 업 https://school.programmers.co.kr/learn/courses/30/lessons/181920
class Solution {
    public int[] solution(int start, int end) {

        int[] answer = new int[end - start + 1];

        for(int i = start, j = 0; i <= end; i++, j++) {
            answer[j] = i;
        }

        return answer;
    }
}