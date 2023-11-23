// 문자열 잘라서 정렬하기 https://school.programmers.co.kr/learn/courses/30/lessons/181866
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> answerList = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                answerList.add(str);
            }
        }
        
        String[] answer = answerList.toArray(new String[answerList.size()]);
        Arrays.sort(answer);
     
        return answer;
    }
}