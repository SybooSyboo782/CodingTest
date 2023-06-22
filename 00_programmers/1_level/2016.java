// 2016년 https://school.programmers.co.kr/learn/courses/30/lessons/12901
class Solution {
    public String solution(int a, int b) {

        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;

        for (int i = 0, month = a - 1; i < month; i++) {
            allDate += date[i];
        }

        allDate += b - 1;
        answer = day[allDate % 7];

        return answer;
    }
}