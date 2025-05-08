import java.util.Arrays;

class Solution {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int x = bill[0];
        int y = bill[1];
        
        while(true){
            if((x<=wallet[0] && y<=wallet[1]) || (x<=wallet[1] && y<=wallet[0]))
        break;
            if(x > y)
                x = x/2;
             else 
                y =  y/2;
                answer++;
                
            }  
            return answer;
        }
        
    }

