import java.util.HashMap;

//완주하지 못한 선수의 이름을 return 
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String success : completion){ // 완주한 사람 명단
            map.put(success, map.getOrDefault(success, 0) + 1);
        }
        
        for(String success : participant){
            if(map.getOrDefault(success, 0) == 0){ // 완주하지 못한 경우
                return success;
            }
            map.put(success, map.get(success) -1);
        }
        return null;
    }
    
}
