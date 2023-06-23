// 명예의 전당 (1) https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        ArrayList<Integer> alist = new ArrayList<>();

        for(int i =  0; i < score.length; i++){

            if(alist.size() < k) {
                alist.add(score[i]);
            } else {
                if(alist.get(0) < score[i]) {
                    alist.remove(0);
                    alist.add(score[i]);
                }
            }

            Collections.sort(alist);
            answer[i] = alist.get(0);
        }

        return answer;
    }
}