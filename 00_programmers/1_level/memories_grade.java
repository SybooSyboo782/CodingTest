// 추억 점수 https://school.programmers.co.kr/learn/courses/30/lessons/176963
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int temp = 0;
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                for(int k = 0; k < name.length; k++) {
                    // photo 안의 값과 name 안의 값이 일치하는 게 있다면 임시값에 추억 점수를 더해준다.
                    if(photo[i][j].equals(name[k])) {
                        temp += yearning[k];
                    }
                }
            }
            answer[i] = temp;
            // 초기화를 해준다.
            temp = 0;
        }
        return answer;
    }
}