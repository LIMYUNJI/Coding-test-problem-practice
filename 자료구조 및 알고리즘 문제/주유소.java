n개의 주유소가 원형으로 배치 되어 있다. 모든 주유소는 연료량(fuel)과 현재 주유소에서 다음 주유소 까지의 거리(disit)라는 두 가지 데이터를 가진다

무제한 기름 탱크가 있는 트럭이 있을 때 전체 주유소를 방문하기 위해 트럭이 출발해야 하는 첫 번째 지점을 계산하는 코드를 완성하시오
(단, 트럭은 빈 탱크로 주유소 중 한 곳에서 방문을 시작한다.)

예를 들어 주어진 데이터가 다음과 같다고 가정하면
	dist = {5,4,6,3,5,7}		fuel ={3, 3, 5, 5, 6, 8}

public class Main {
	public static int Gasstation(int[] fuel, int[] dist) {
		int n = fuel.length;
		int totalfuel = 0; // 전체 잔여 연료
		int totaldist = 0; // 전체 거리
		int tank = 0; // 탱크안 현재 잔여 연료
		int firstplace = 0; // 첫번째 지점
		
		for (int i = 0; i < n; i++) {
			int residualgas = fuel[i] - dist[i];
			totalfuel += fuel[i];
			totaldist += dist[i];
			tank += residualgas;
		
			if (tank < 0) {
				firstplace = i + 1; // 다음 정류장으로
				tank = 0;
			}
		
		}
		
		// 연료가 부족하면
		if (totalfuel < totaldist) {
			return -1; // 정주행 불가능
		}
		return firstplace;
	}

	public static void main(String[] args) {
		int[] dist = { 5, 4, 6, 3, 5, 7 };
		int[] fuel = { 3, 3, 4, 4, 6, 8 };

		int result = Gasstation(fuel, dist);

		System.out.println(result);
	

	}
}

public class Main {
	public static int Gasstation(int[] fuel, int[] dist) {
		int tank = 0; // 현재 잔여 연료
		int totalfuel = 0; // 전체 잔여 연료
		int start = 0;
		
		for (int i = 0; i < fuel.length; i++) {
			int residualgas = fuel[i] - dist[i];
		
			if (tank >= 0) {
				tank +=  residualgas;
				}else {
				tank = residualgas;
start = 1;
			}

totalfuel += residualgas;
		
		}
		
		// 연료가 부족하면
		if (totalfuel >= 0) {
			return start;
		}else {
		return -1;
	}
}
	public static void main(String[] args) {
		int[] dist = { 5, 4, 6, 3, 5, 7 };
		int[] fuel = { 3, 3, 4, 4, 6, 8 };

		int result = Gasstation(fuel, dist);

		System.out.println(result);
	

	}
}

n개의 퀸이 서로 공격할 수 없는 경우의 수를 구하는 코드(4개)

class Solution{
	private static int N;   		// 체스판의 크기
	private static int width;		y = 현재 퀸을 놓을 위치
	private static boolean[] dla1;	width[i] => 특정 열에 퀸이 위치 했								는지 표시
						// dla1 => 중복 체크용 배열 오른쪽 위 -> 왼쪽 아래 방향 대각선 방향
						// dla2 => 중복 체크용 배열 왼쪽 위 -> 오른쪽 아래 방향 대각선 방향
	private static boolean[] dla2;



}
