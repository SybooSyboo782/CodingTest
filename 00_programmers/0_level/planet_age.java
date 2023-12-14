// 외계행성의 나이 https://school.programmers.co.kr/learn/courses/30/lessons/120834?language=java
import java.util.*;
class Solution {
    public String solution(int age) {
        StringBuilder planetAge = new StringBuilder();

        while (age > 0) {
            int digit = age % 10;
            char alphabet = (char) ('a' + digit);
            planetAge.insert(0, alphabet);
            age /= 10;
        }

        return planetAge.toString();
    }
}