import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no10871 {
	public static void main(String[] args) throws IOException {
		// 입력값을 받기 위해 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 공백을 기준으로 입력값을 분리하여 토큰으로 처리하기 위해 선언
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		// 첫번째 입력 받은 문자열 값을 정수로 변환하여 n에 저장(수열의 크기)
		int n = Integer.parseInt(str.nextToken());
		// 두번쨰 입력 받은 문자열 값을 정수로 변환하여 x에저장
		int x = Integer.parseInt(str.nextToken());
		// 정수 n개로 이루어진 수열을 저장할 배열 선언
		int[] arr = new int[n];
		
		// 두번째 줄을 공백을 기준으로 분리하여 토근으로 처리
		str = new StringTokenizer(br.readLine());
		
		// 수열의 각 원소 값을 배열arr에 저장
		for(int i =0; i< n; i++) {
			     arr[i] = Integer.parseInt(str.nextToken());
		}
		// 입력받은 x값보다 작은 수들 출력
		for(int i = 0; i< n; i++) {
			if ( arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력 받기 위해 선언
		
		int[] arr = new int[9]; // 배열크기
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0; // 최대값
		int index = 0; // 자리 수
		
		int count = 0;
		
		for(int value : arr) {
			count ++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max); // 최대값 출력
		System.out.println(index); // 몇번째 값인지 출력
	}

}
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 문제