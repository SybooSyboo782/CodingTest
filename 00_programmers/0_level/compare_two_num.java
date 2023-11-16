// 두 수의 연산값 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181938
class Solution {
    public int solution(int a, int b) {
        
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        
        int a_sum_b = Integer.valueOf(str_a + str_b).intValue();
        
        if(a_sum_b < 2 * a * b) {
            return 2 * a * b;
        } else {
            return a_sum_b;
        }
        
    }
}