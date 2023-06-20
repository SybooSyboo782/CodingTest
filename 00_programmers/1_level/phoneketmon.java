// 폰켓몬 https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.*;

class Solution {
    public int solution(int[] nums) {

        Set<Integer> iset = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            iset.add(new Integer(nums[i]));
        }

        int answer = nums.length / 2;

        if(answer < iset.size()) {

            return answer;

        } else {

            answer = iset.size();
            return answer;

        }

    }
}