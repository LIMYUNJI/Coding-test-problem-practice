import java.util.ArrayDeque;

class Solution {
  private boolean solution(String s) {
        
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        
        char[] a = s.toCharArray(); // 문자열을 문자 배열로 변환
         for(char c : a){
           if(c == '('){
            stack.push(c);
           } else if(stack.isEmpty()||stack.pop() == ')') { // 스택이 비어있는지 확인
               return false;
         }
        }
        return stack.isEmpty();
    }
}
