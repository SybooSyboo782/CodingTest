class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String answer = "fail";
        int i = 0;
        
        System.out.print(db[1][0]);
    
        for(i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        
        return answer;
    }
}
