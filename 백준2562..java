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
