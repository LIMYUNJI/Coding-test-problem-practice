import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        int num = arr[0];

        List<Integer> list = new ArrayList<>();
        list.add(num);
 
        for(int i = 0; i<arr.length; i++){
            if(num != arr[i]){
                list.add(arr[i]);
                num = arr[i];
            }
        }
      
        int[] answer = new int[list.size()];
        for(int i  = 0; i <list.size(); i++){
            answer[i] = list.get(i);
        }
      
        return answer;
    }
}
