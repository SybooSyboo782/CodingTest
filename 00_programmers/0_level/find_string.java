// 원하는 문자열 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/181878
class Solution {
    public int solution(String myString, String pat) {
                
        if(myString.toUpperCase().contains(pat.toUpperCase())){
            return 1;
        } else {
            return 0;
        }
    }
}