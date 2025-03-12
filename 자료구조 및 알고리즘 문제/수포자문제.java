package Testsolution;

public class Test04 {
	// 수포자 문제 
	// 1번 문제부터 마지막 문제까지 답이 들은 배열 = answer
	// 가장 많은 문제를 맞힌 사람이 누구인지, 
	// 동일 점수사람들 오름차순으로 정렬
	class Solution{
		public static int[] solution(int[] answers) {
			// 수포자 패턴
			int[][] pattern = {
					{1,2,3,4,5},
					{2,1,2,3,2,4,2,5},
					{3,3,1,1,2,2,4,4,5,5}
					
			};
			// 수포자들을 저장할 배열

			// 각 수포자의 패턴의 정답이 얼마나 일치하는지 확인

			// 가장 높은 점수 저장
			// 가장 높은 점수를 가진 수포자들의 번호를 찾아서 리스트에 담음
			return answers.stream().mapToInt(Interger::intValue).toArray();
		}
	}
	
}
