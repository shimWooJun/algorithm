class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int sum = 0;
        for(int i = 0; k*(i+1) <= n; i++){
            sum += k;
            answer[i] = sum;
        }
        return answer;
    }
}