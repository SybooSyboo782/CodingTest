// 등차수열의 특정한 항만 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/181931
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int length = included.length;
        
        for (int i = 0; i < length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            } else {
                ;
            }
        }
        return answer;
    }
}