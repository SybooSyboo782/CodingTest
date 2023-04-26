https://school.programmers.co.kr/learn/courses/30/lessons/12944

// 프로그래머스 평균구하기 문제

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // 입력받은 배열의 길이동안 정답에 값 더하기
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        //결과값을 반환할 때, 정답(총 값) / 배열의 길이를 해서 평균 구하기 
        return answer/arr.length;
    }
}