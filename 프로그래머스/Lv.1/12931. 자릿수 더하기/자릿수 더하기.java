import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        for(int i = 0; i < a.length(); i++){
            answer += Integer.parseInt(a.substring(i, i+1));
        }

        return answer;
    }
}