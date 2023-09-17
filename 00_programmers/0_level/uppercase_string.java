// 특정한 문자를 대문자로 바꾸기 https://school.programmers.co.kr/learn/courses/30/lessons/181873?language=java
class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}