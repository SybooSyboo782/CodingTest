// 접미사 배열 https://school.programmers.co.kr/learn/courses/30/lessons/181909
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixes = new String[length];

        for (int i = 0; i < length; i++) {
            suffixes[i] = my_string.substring(i);
        }

        Arrays.sort(suffixes);

        return suffixes;
    }
}