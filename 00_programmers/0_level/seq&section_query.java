// 수열과 구간 쿼리 4 https://school.programmers.co.kr/learn/courses/30/lessons/181922
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++) {
               if(j%k==0){
                    arr[j] += 1;   
                } 
            }
        }
        return arr;
    }
}