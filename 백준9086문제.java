import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<num; i++) {
			String st = br.readLine();
			System.out.println(String.valueOf(st.charAt(0))+ String.valueOf(st.charAt(st.length()-1)));
		}
		br.close();
	}
}