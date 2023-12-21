// 숫자 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/120904
class Solution {
    public int solution(int num, int k) {
        
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        
        if (answer == -1) {
            return answer;
        } else {
            return answer + 1;
        }
    }
}