// 공백으로 구분하기 2 https://school.programmers.co.kr/learn/courses/30/lessons/181868?language=java
class Solution {
    public String[] solution(String my_string) {

        return my_string.trim().split("[ ]+");
    }
}
