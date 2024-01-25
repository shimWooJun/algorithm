class Solution {
    public int solution(double num) {
        int answer = 0;
        
        while(num != 1){
            
            answer +=1;
            
            if(num%2==0){
                num /= 2;
            }else{
                num = num*3 + 1;
            }
            
        }
        
        if(answer >= 450){
         answer = -1;
        }
        
        return answer;
    }
}