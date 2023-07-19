// 배열 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/120821
 class Solution {
    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.lengt배열 뒤집기h];

        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
        }

        return answer;
    }
}