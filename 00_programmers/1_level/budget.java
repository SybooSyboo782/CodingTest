// 예산 https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {

        int total = 0;

        // d 정렬 시키기
        Arrays.sort(d);

        // 작은 순대로 더하다가 total 값이 budget을 넘기기기 전 개수를 세서 반환하기
        for(int i = 0; i < d.length; i++){
            total += d[i];
            if(total > budget) {
                return (i);
            }
        }

        return d.length;
    }
}