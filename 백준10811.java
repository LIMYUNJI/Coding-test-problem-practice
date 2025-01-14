import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 10811번 문제
		/*
		 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
		 * 
		 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터
		 * j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
		 * 
		 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
		 */

		Scanner scanner = new Scanner(System.in);

		// 첫째 줄 입력: N과 M
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		// 바구니 배열 초기화 (1부터 N까지)
		int[] baskets = new int[N];
		for (int i = 0; i < N; i++) {
			baskets[i] = i + 1;
		}

		// M개의 줄 입력 처리
		for (int m = 0; m < M; m++) {
			int i = scanner.nextInt() - 1; // 0-based index
			int j = scanner.nextInt() - 1; // 0-based index

			// 범위 [i, j]를 역순으로 바꿈
			reverse(baskets, i, j);
		}

		// 결과 출력
		for (int basket : baskets) {
			System.out.print(basket + " ");
		}
	}

	// 배열의 부분 [start, end]를 역순으로 만드는 메서드
	private static void reverse(int[] array, int start, int end) {
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}

	}

}
