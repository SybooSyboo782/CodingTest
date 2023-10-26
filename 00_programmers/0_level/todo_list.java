// 할 일 목록 https://school.programmers.co.kr/learn/courses/30/lessons/181885
import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (false == finished[i]) {
                answerList.add(todo_list[i]);
            } else {
                ;
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        
        return answer;
    }
}