import java.util.HashMap;
 
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
 
        HashMap<String, Integer> map = new HashMap<>();
        for(int a=0; a<name.length; a++){
            map.put(name[a], yearning[a]);
        }
 
        for(int a=0; a<photo.length; a++){
            int totalVal = 0;
            for(int s=0; s<photo[a].length; s++){
                if(map.containsKey(photo[a][s])) 
                totalVal += (map.containsKey(photo[a][s])) ? map.get(photo[a][s]) : 0;
            }
            answer[a] = totalVal;
        }
        
        return answer;
    }
}
