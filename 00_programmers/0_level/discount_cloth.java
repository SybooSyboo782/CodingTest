// 옷가게 할인 받기 https://school.programmers.co.kr/learn/courses/30/lessons/120818
class Solution {
    public int solution(int price) {

        double answer = 0;

        if(100000 <= price && price < 300000) {
            price *= 0.95;
        } else if (300000 <= price && price < 500000) {
            price *= 0.9;
        } else if (500000 <= price) {
            price *= 0.8;
        } else {
            System.out.print("Error");
        }

        return price;
    }
}