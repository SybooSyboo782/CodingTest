// 수열과 구간 쿼리 3 https://school.programmers.co.kr/learn/courses/30/lessons/181924
class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int n = 0;
        int q_length = queries.length;
        for (int i = 0; i < q_length; i++){
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }
        return arr;
    }
}