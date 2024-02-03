// 세 개의 구분자 https://school.programmers.co.kr/learn/courses/30/lessons/181862
import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();

        StringBuilder temp = new StringBuilder();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (temp.length() > 0) {
                    result.add(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(c);
            }
        }

        if (temp.length() > 0) {
            result.add(temp.toString());
        }

        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}