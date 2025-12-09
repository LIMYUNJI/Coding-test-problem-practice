import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		StringTokenizer str;
		for (int i = 0; i < count; i++) {
			str = new StringTokenizer(br.readLine(), " ");

			int x = Integer.parseInt(str.nextToken());
			int y = Integer.parseInt(str.nextToken());
			int sum = x + y;

			bw.write(sum + "\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}
}
