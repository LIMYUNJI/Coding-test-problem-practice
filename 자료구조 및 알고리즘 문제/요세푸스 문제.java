import java.util.ArrayDeque;

class Solution {
	private static int solution(int N, int K){
	    ArrayDeque<Integer> deque = new ArrayDeque<>();
	    for(int i = 0; i <= N; i++){
		deque.addLast(i);
	}
	while( deque.size() > 1){ //사람이 한명 남을 때 까지
		for(int i = 0; i < K-1; i++){
			deque.addLast(deque.pollFirst());
		}
	
		deque.pollFirst();
	   }
	return deque.pollFirst();
	}

}
