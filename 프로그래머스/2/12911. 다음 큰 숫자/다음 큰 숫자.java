class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = 0;
        String nBinary, jBinary;
        
        nBinary = Integer.toBinaryString(n);
        
        for(int i = 0; i < nBinary.length(); i++) {
            if(nBinary.charAt(i) == '1'){
                oneCnt++;
            }
        }
        
        for(int j = n+1; j < n+100; j++) {
            jBinary = Integer.toBinaryString(j);
            int jOneCnt = 0;
            for(int k = 0; k < jBinary.length(); k++){
                if(jBinary.charAt(k) == '1'){
                    jOneCnt++;
                }
            }
            if(oneCnt == jOneCnt){
                answer = j;
                break;
            }
        }
        return answer;
    }
}