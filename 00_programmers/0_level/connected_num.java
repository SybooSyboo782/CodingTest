// 이어 붙인 수 https://school.programmers.co.kr/learn/courses/30/lessons/181928
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}