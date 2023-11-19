class Solution {
    public int solution(int a, int b) {
        
        String abstring = String.valueOf(a) + String.valueOf(b);
        int abint = Integer.parseInt(abstring);
        
        int c = 2 * a * b;
        
        if(abint < c){
            return c;
        } else if(abint > c){
            return abint;
        } else{
            return abint;
        }
    }
}