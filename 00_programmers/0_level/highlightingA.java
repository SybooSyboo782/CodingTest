// A 강조하기 https://school.programmers.co.kr/learn/courses/30/lessons/181874?language=java
class Solution {
    public String solution(String myString) {
        
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        
        return myString;
    }
}