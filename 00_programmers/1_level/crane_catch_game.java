// 크레인 인형뽑기 게임 https://school.programmers.co.kr/learn/courses/30/lessons/64061
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {

        ArrayList<Integer> alist = new ArrayList<>();
        int answer = 0;
        alist.add(0);

        for(int i = 0; i < moves.length; i++) {

            for(int j = 0; j < board.length; j++) {

                if(board[j][moves[i]-1] != 0) {

                    if(alist.get(alist.size()-1) == board[j][moves[i]-1]) {

                        alist.remove(alist.size() - 1);
                        answer += 2;

                    } else {

                        alist.add(board[j][moves[i] - 1]);

                    }

                    board[j][moves[i]-1] = 0;
                    break;

                }
            }
        }

        return answer;
    }
}