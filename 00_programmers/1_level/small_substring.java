// 크기가 작은 부분문자열 https://school.programmers.co.kr/learn/courses/30/lessons/147355
class Solution {
    public int solution(String t, String p) {

        long long_p = Long.parseLong(p);
        int p_length = p.length();
        int t_length = t.length();
        int sub_length = t_length - p_length;
        int answer = 0;
        String temp = "";

        for(int i = 0; i < sub_length + 1; i++) {

            // 임시값에 p의 길이만큼 문자들을 합쳐준다.
            for(int j = 0; j < p_length; j++) {
                temp += t.charAt(i + j);
            }

            // 임시로 합쳐진 문자열을 Long 타입으로 파싱한다.
            long long_t = Long.parseLong(temp);

            // 만약 임시 문자열의 크기가 더 작을 경우에는
            if(long_p >= long_t) {
                // 정답 카운트를 올려준다.
                answer++;
            }

            // 임시 문자열을 다시 초기화하여 for문이 돌게한다.
            temp = "";
        }
        return answer;
    }
}