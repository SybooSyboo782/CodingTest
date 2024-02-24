// 문자열 계산하기 https://school.programmers.co.kr/learn/courses/30/lessons/120902
class Solution {
    public int solution(String my_string) {
        
        String [] list = my_string.split(" ");
        
        int answer = 0;
        answer += Integer.parseInt(list[0]);
        
        for(int i = 1; i < list.length; i ++) {
            if (i % 2 != 0) {
                if (list[i].equals("+")) {
                    answer += Integer.parseInt(list[i + 1]);
                } else if (list[i].equals("-")) {
                    answer -= Integer.parseInt(list[i + 1]);
                } else {
                    System.out.print("ERROR");
                }
            } else {
                ;
            }
        }
        
        return answer;
    }
}