import java.util.ArrayDeque;

public class Solution{
	public static void main(String[] args) {
		System.out.println(solution(5,2));
	}
	
	private static int solution(int N, int K) { // 번호표(1~N), 없앨 사람의 번호
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) { // 번호표 1부터 시작 함 명심할것
			deque.add(i); // 큐에 요소 추가
		}
		while (deque.size() > 1) {// 사람이 한명 남을 때 까지
			
			for (int i = 0; i < K - 1; i++) { // K요소 찾기
				deque.addLast(deque.pollFirst());
			}
			deque.pollFirst();
		}
		return deque.pollFirst();
	}

}
