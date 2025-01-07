import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int[] arr = new int[10];
		
		
		for ( int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
			
		}
		
		int num = -1;
		int count = 0;
		
		Arrays.sort(arr); // 중복제거
		
		for(int i = 0; i<arr.length; i++) {
				if (num != arr[i]) {
					num = arr[i];
					count++;
				}
			}
			
		System.out.println(count);
	}

}