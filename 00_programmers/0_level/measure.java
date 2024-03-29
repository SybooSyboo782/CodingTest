// 약수 구하기 https://school.programmers.co.kr/learn/courses/30/lessons/120897
import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] divisors = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[count++] = i;
            }
        }
        return Arrays.copyOf(divisors, count);
    }
}