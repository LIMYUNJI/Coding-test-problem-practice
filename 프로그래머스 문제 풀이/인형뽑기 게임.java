import java.util.Stack;

class Solution{
  public int solution(int[][] board, int moves) {
    int result = 0; // 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수
    Stack<Integer> stack = new Stack<>; // 바구니

    for( int i = 0; i < moves.length; i++) {
      for(int j = 0; j < board.length; j++){
        int a = board[j][moves[i]-1];

        if(a == 0){
          continue;
        }
        board[j][moves[i]-1] = 0;
        if(!stack.isEmpty()&&stack.peek() == a){
          stack.pop();
          result +=2;
        } else {
          stack.push(a);
      }
        break;
      }
    }
      return result;
    
  }
}
