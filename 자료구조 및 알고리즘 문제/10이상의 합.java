import java.util.ArrayList;

class Solution {
	private static ArrayList<ArrayList<Integer>> result;
	private static int n;
	private static void back(int sum, ArrayList<Integer> selectNum, int start) {
		// 합이 10이 되면 리스트 추가
		if (sum == 10) {
			result.add(selectNum);
			return;
		}
		// 합이 10 이상이면 백트래킹한다
if (sum + i <= 10) {
		for (int i = start; i <= n; i++) {
			ArrayList<Integer> list = new ArrayList<>(selectNum);
			list.add(i);
			back(sum + i, list, i + 1);
}
		}
	}

	private static ArrayList<ArrayList<Integer>> solution(int N) {
		result = new ArrayList<>();
		n = N;
		back(0, new ArrayList<>(), 1);
		return result;
	}
}

class Solution{
private static void back(){
}
	// 백트래킹을 위한 DFS
public int solution(){
}
}
