// 문자열 여러 번 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/181913
class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
}