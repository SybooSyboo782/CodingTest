// K번째수 https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int c_length = commands.length;
        int[] answer = new int[c_length];
        
        for(int i = 0; i < c_length; i++){
            
            int[] temp = new int[commands[i][1]-(commands[i][0]-1)];
            
            for(int j= 0, j_length = temp.length; j < j_length; j++){
                
                temp[j] = array[j+(commands[i][0]-1)];
                
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2]-1];
 
        }
        
        return answer;
    }
}