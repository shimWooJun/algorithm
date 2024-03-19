class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        long longMoney = money - sum;
        
        if (longMoney >= 0) {
            answer = 0;
        } else {
            answer = Math.abs(longMoney);
        }

        return answer;
    }
}