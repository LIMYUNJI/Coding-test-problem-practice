package greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// 귤 문제 HashMap(중복X) 을 사용하거나 배열로 구현
/* 수확한 귤중 K개를 골라 상자에 담아 판매하려고 함
 * 귤을 크리별로 분류했을 때 서로 다른 종류의 수를 최소화
 * 
 * 큘의 크기가 8개[1,2,3,4,5,5,2,3], 경화가 귤을 6개 판매 하고 싶다면,
 * 크기가 1, 4인귤을 제외한 6개의 귤을 상자에 담으면
 * 귤의 크기와 종류가 2,3,5로 총3가지가 되며, 서로 다른 종류가 최소
 * 
 * 한상자 기준
 * 귤의 개수 k개, 귤의 크키를 담은 배열 tangerine가 매개변수
 * 귤 k개를 고를 때 크기가 서로 다른 종류의 수 최솟값을 return하는 solution 함수를 작성하시오
 * 
 * k = 6 tangerine = [1,3,2,5,4,5,2,3] result = 3
 * k = 4 tangerine = [1,3,2,5,4,5,2,3] result = 2
 * k = 2 tangerine = [1,1,1,1,2,2,2,3] result = 1
 * */
public class greedTest03 {
	static class Solution{
		public int solution(int[] tangerine, int k) {
			// 크기별 개수 파악
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i: tangerine) {
				// tangerine 에 i가 있다면 +1을 해서 다시 넣어줍니다.
				map.put(i, map.getOrDefault(i,0)+1);
			}
			
			// 내림차순
			ArrayList<Integer> keyset = new ArrayList<>(map.values());
			keyset.sort(Collections.reverseOrder());
			
			int result = 0; // 현재 귤의 종류
			int numSum =0; // 현재 귤의 합
			
			for(int count : keyset){
				numSum += count; 
				result++;
				if(numSum >= k) {
					break;
				}
			}
			
			return result;
		}
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		int k = 4;
		System.out.println(sol.solution(tangerine, k));
		
	}
	
}
