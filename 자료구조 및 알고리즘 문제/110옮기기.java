import java.util.ArrayDeque;
import java.util.Arrays;

class Solution{
  public static void main{
    System.out.println(Arrays.toString(solution(new String[] {"1110","100111100","0111111010"})));
    System.out.println(Arrays.toString(solution(new String[] {"1011110","01110","101101111010"})));
    System.out.println(Arrays.toString(solution(new String[] {"10110","100111100","0111111010"})));
    
  }

  public static String[] soltion(String[] s){
    String[] answer = new String[s.length];

    for(int i = 0; i < s.length; i++){
      StringBuilder start = new StringBuilder();
      ArrayDeque<Character> stack = new ArrayDeque<>();
      char[] end = s[i].toCharArray();

      for(char c : end){
        stack.push(c);
        if(stack.size() > 3){
          
        }
      }
    }
  }
}
