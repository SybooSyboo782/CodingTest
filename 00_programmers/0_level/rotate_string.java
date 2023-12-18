// 문자열 돌리기 https://school.programmers.co.kr/learn/courses/30/lessons/181945?language=java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int a_length = a.length();
        
        for (int i = 0; i < a_length; i++) {
            System.out.println(a.charAt(i));
        }
    }
}