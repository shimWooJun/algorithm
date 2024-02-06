class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        
        int[] intArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            intArray[i] = Integer.parseInt(array[i]);
        }
        
        int min = intArray[0];
        int max = intArray[0];
        
        for(int i = 1; i < intArray.length; i++){
            if(intArray[i] < min){
                min = intArray[i];
            }
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}