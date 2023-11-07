// 가위 바위 보 https://school.programmers.co.kr/learn/courses/30/lessons/
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
			answer += rsp.charAt(i)=='2' ? "0" : rsp.charAt(i)=='0' ? "5" : "2";   
		}
        return answer;
    }
}
