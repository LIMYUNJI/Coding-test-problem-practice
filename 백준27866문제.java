import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String st = br.readLine();
		char[] count = st.toCharArray();
		
		if(count.length > 1000) {
			return;
		}
		
		int i = Integer.parseInt(br.readLine());
		
		if(i < 1 || i > count.length) {
			return;
		}
		bw.write(count[i-1]);
		bw.flush();
		
		
		bw.close();
		br.close();
	}
}