import java.util.ArrayList;
import java.util.Arrays;

/*
 * 거스름돈을 최소한의 화폐수로 받고 싶음
 * 거스름돈: amount
 * 화폐단위 [1,10,50,100]
 * 최소한으로 사용한 화폐리스트를 반환하는 함수를 작성
 * 
 * 조건, 반환하는 값의 화폐단위는 내림차순이어야 함
 * 
 * 입력값 amount= 123 결과값 [100, 10, 10, 1,1,1]
 * 입력값 amount= 350 결과값 [100, 100, 100,50]
 * */
public class greedTest01 {
	
	static class Solution{
		private static int[] solution(int amount){
			
			// 화폐단위 저장(내림차순)
			int[] monetary = {100, 50, 10, 1};
			
			// 거슬러줄돈 담을 ArratList
			ArrayList<Integer> change = new ArrayList<>();
			for(int coin: monetary) {
				// 게속 거스름돈을 계속 나눈다
				// 현재 화폐단위보다 크거나 같은 경우
				while(amount >= coin) {
					change.add(coin); // 거스름돈을 업데이트
					amount -= coin; 
				}
			}
			
			return change.stream().mapToInt(Integer::intValue).toArray();
		}
		public static void main(String[] args) {
			int[] result = solution(123);
            System.out.println(Arrays.toString(result));
		}
	}

}
