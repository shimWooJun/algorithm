class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.length() % 2 == 0){
                answer += s.charAt(s.length() / 2 - 1);
                answer += s.charAt(s.length() / 2);
                break;
            } else {
                answer += s.charAt(s.length() / 2);
                break;
            }
        }
            
        return answer;
    }
}