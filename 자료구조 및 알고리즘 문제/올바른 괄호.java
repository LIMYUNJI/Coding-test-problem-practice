import java.util.ArrayDeque;

class Solution {
  private boolean solution(String s) { // 결과값이 참아니면 거짓으로 반환되므로 boolean타입으로 선언
        // 닫힌 괄호가 가장까가운 열린 괄호와 만나면 상쇄되기때문에 stack으로 문제풀이 결정
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        
        char[] a = s.toCharArray(); // 문자열을 문자 배열로 변환
         for(char c : a){
           if(c == '('){
            stack.push(c);
           } else if(stack.isEmpty()||stack.pop() == ')') { // 스택이 비어있는지 확인(스택이 비어있는 경우 EmptyStackException 예외가 발생하기 때문에)
               return false;
         }
        }
        return stack.isEmpty(); // 괄호가 모두 상쇄 되는 경우 스택이 비어있음으로 참, 괄호가 올바르지 않은경우(예: )() 거짓값 리턴
    }
}
