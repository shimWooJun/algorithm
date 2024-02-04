import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int sum = 0;
            sum = (int) Math.sqrt(i);
            if(sum * sum != i){
                answer += i;
            }else if(sum * sum == i){
                answer -= i;
            }
        }
        return answer;
    }
}