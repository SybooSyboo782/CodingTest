// 수 조작하기 1 https://school.programmers.co.kr/learn/courses/30/lessons/181926
class Solution {
    public int solution(int n, String control) {
        
        int answer = n;
        
        for(int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' : answer += 1;
                    break;
                case 's' : answer -= 1;
                    break;
                case 'd' : answer += 10;
                    break;
                case 'a' : answer -= 10;
                    break;
                default : break;
                    
            }
        }
        
        return answer;
    }
}