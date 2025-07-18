// 유니온 파인드 알고리즘은 다음과 같은 일을 할 수 있다.
// 1. 두 부분 집합을 하나의 부분 집합으로 병합
// 2. 주어진 원소가 속한 부분 집합을 반환
//	{같은 부분 집합에 속한 데이터 찾기}
import java.util.ArrayList;


class Solution{
	private static int[] parent;
	// 루트 노드를 찾는 메서드
	public int Find(int x){
		if(parent[x] == x){
			return x;
		} else {
			parent[x] = find(parent[x]);
			return parent[x]; // 찾은 루트노드를 반환
		}

	}

	public void union(int x, int y){
		int root1 = find(x);
		int root2 = find(y);
		parent[root2] = root1; // 합치기
	}

	public void Boolean[] solution(int k,  int[][] operation){
		parent = new int[k];
		// 초기화
		for(int i =0; i < k; i++){
			parent[i] = i;
		}
		ArrayList<Boolean> answer = new ArrayList<>();

		for(int[] oper : operation){
			if(oper[0] == 0){
				union(oper[1], oper[2]);
			} else {
				answer.add(find(oper[1]) == find(oper[2]));
			}
		}
		return answer.toArray(new Boolean[0]);
	}
}
