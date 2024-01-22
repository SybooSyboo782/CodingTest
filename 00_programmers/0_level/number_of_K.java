// k의 개수 https://school.programmers.co.kr/learn/courses/30/lessons/120887
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str_k = String.valueOf(k);
        
        for (; i <= j; i++) {
            answer += countAnswer(String.valueOf(i), str_k);
        }
        
        return answer;
    }

    private int countAnswer(String value, String target) {
        int count = 0;
        int index = value.indexOf(target);
        
        while (index != -1) {
            count++;
            index = value.indexOf(target, index + 1);
        }

        return count;
    }
}