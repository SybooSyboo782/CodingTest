// 이상한 문자 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12930
class Solution {
    public String solution(String s) {

        String[] str = s.split("");
        String answer = "";
        int temp = 0;

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) {
                answer += str[i];
                temp = 0;
            }

            else if(temp % 2 == 0) {
                answer += str[i].toUpperCase();
                temp++;
            }

            else if(temp % 2 != 0) {
                answer += str[i].toLowerCase();
                temp++;
            }


        }

        System.out.print(answer);
        return answer;
    }
}