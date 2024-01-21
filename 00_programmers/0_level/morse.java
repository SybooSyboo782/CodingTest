// 모스부호 (1) https://school.programmers.co.kr/learn/courses/30/lessons/120838
import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] morseString = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0, mLength = morse.length; i < mLength; i ++) {
                if(word.equals(morse[i])) {
                    sb.append(Character.toString(i + 'a'));
                } else {;}
            }
        }
        
        answer = sb.toString();
            
        return answer;
    }
}