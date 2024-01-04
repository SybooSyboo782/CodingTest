
// 날짜 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181838
class Solution {
    public int solution(int[] date1, int[] date2) {
        
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        } 
        
        if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        } 
        
        return date1[2] < date2[2] ? 1 : 0;
    }
}