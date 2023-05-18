// 제일 작은 수 제거하기 https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // 값이 1개면 리턴하기
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // 배열 깊은 복사 하기
        int[] temp = Arrays.copyOf(arr, arr.length);
        
        // 임시 배열 오름차순 정렬하기
        Arrays.sort(temp);
        
        // 배열의 최소값 위치 찾기
        int num = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == temp[0]) {
                num = i;
            }
        }
        
        // 원본 배열길이보다 1 작은 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
                
        for(int i = 0; i < arr.length; i++) {
            
            // 최소값이랑 일치할 경우에는 넘어가기
            if (arr[i] == temp[0]) {
                continue;
            }
            // 정답배열에 원본 배열의 값을 넣어주기
            answer[index++] = arr[i];
        }
        
        return answer;
        
    }
}