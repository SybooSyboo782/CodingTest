// 모음 제거 https://school.programmers.co.kr/learn/courses/30/lessons/120849
class Solution {
    public String solution(String my_string) {

        return my_string.replaceAll("[aeiou]","");
    }
}