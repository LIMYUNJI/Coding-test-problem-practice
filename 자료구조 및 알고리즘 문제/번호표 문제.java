import java.util.ArrayDeque;

class Solution{
  private int solution(int N, int K){ // 번호표(1~N), 없앨 사람의 번호
    ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i <=N; i++;){
          deque.add(i); // 큐에 요소 추가
        }
    while(deque.size() > 1){// 사람이 한명 남을 때 까지
      for(int 1 = 0; i < k-1; i++;){ // K요소 찾기
        deque.Lastadd(deque.pollFirst()); 
      }
        deque.pollFirst();
    }
    retuen deque.pollFirst(); 
  }

  
}
