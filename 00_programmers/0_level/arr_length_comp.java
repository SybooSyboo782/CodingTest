// 배열의 길이에 따라 다른 연산하기 https://school.programmers.co.kr/learn/courses/30/lessons/181854
class Solution {
    public int[] solution(int[] arr, int n) {
        int arrLength = arr.length;
        
        for(int i = 0; i < arrLength; i++){
            if(arrLength % 2 == 1 && i % 2 == 0){
                arr[i] += n;
            }
            if(arrLength % 2 == 0 && i % 2 == 1){
                arr[i] += n;
            }
        }
        return arr;
    }
}