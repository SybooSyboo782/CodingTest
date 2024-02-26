// 왼쪽 오른쪽 https://school.programmers.co.kr/learn/courses/30/lessons/181890
import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int str_length = str_list.length;
        for (int i = 0; i < str_length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_length);
            } else {;}
        }
        return answer;
    }
}