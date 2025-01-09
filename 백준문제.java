import java.util.Scanner;

public class Main {
	public static void main(String[] argr) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
		scanner.close();
	}

}
import java.util.Scanner;

public class Main {
	public static void main(String[] argr) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79 ) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
import java.util.Scanner;

public class Main {
	public static void main(String[] argr) {

		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("1");
		} else if (year % 4 == 0 && year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");

		}
		scanner.close();
	}

}
--> 문제 제출시 주의할 점 100의 배수가 아닌 조건을 쓸때
year % 100 == 1은 틀리다고 인식하니 year != 0로 작성해야함

import java.util.Scanner;

public class Main {
	public static void main(String[] argr) {

		Scanner scanner = new Scanner(System.in);
		int datA = scanner.nextInt();
		int datB = scanner.nextInt();

		if (datA >= 0 && datB >= 0) {
			System.out.println("1");
		} else if (datA <= 0 && datB >= 0) {
			System.out.println("2");
		} else if (datA <= 0 && datB <= 0) {
			System.out.println("3");
		} else if(datA >= 0 && datB <= 0) {
			System.out.println("4");
		}
		
		scanner.close();
		
	}

}
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] argr) {

		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		StringTokenizer str = new StringTokenizer(time, " ");
		
		
		int H = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());

		if (H < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
처음에는 숫자로 입력을 받아서 파싱과정 없이 구현을 했더니 틀렸다고 판단을 받아서 문자열을 입력받아서 파싱과정을 거쳐서 문제를 위같이 풀었는데 계속 틀렸다고 해서 왜 틀린지를 잘 모르겠어서 고민을 했다.... 알고보니 0 0분을 입력 했을 때 잘못된 값이 출력되고 있어서 아래와 같이 문제를 풀었더니 맞다는 답이 나왔다.

그래서 아래 코드와 같이 Buffer보조스트림을 써서 문제를 풀었더니 정상적으로 맞았다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
     }
        
  }