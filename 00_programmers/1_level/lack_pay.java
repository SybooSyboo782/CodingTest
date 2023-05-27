// 부족한 금액 계산하기 https://school.programmers.co.kr/learn/courses/30/lessons/82612
class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = 0;
        long answer = 0;
        
        for(int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        System.out.print(sum);
        
        if(sum > money) {
            answer = sum - money;
        }

        return answer;
    }
}