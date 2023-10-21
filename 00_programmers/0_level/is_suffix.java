// 접미사인지 확인하기 https://school.programmers.co.kr/learn/courses/30/lessons/181908?language=java
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        final int suffixLength = is_suffix.length();
        final int myStringLength = my_string.length();

        if (suffixLength <= myStringLength) {
            
            String suffix = my_string.substring(myStringLength - suffixLength);
            
            if (suffix.equals(is_suffix)) {
                answer = 1;
            } else {
            	answer = 0;
            }
        }
        
        return answer;
    }
}