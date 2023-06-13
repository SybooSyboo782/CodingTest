// 문자열 내 마음대로 정렬하기 https://school.programmers.co.kr/learn/courses/30/lessons/12915
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        // 첫 글자와 문자열을 저장한다.
        for(int i = 0, s_length = strings.length; i < s_length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // Collections 의 오름차순 정렬을 한다.
        Collections.sort(list);

        // list의 크기만큼 첫 글자를 제외한 문자열을 정답 배열에 저장한다.
        for(int i = 0, l_size = list.size(); i < l_size; i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;

    }
}