// n개 간격의 원소들 https://school.programmers.co.kr/learn/courses/30/lessons/181888
class Solution {
    public int[] solution(int[] num_list, int n) {

        int temp = 0;

        for(int i = 0; i < num_list.length; i += n) {
            temp++;
        }

        int[] answer = new int[temp];

        for(int i = 0, count = 0; i < temp; i ++, count++) {
            answer[count] = num_list[i * n];
        }

        return answer;
    }
}