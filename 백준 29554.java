import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] j = new int[n];
        int[] l = new int[n];
        int[] s = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            j[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int day = 0;
        boolean found = false;

        // 시작부터 제다이가 시스보다 나쁘지 않은 첫 날 찾기
        while (!found) {
            found = true;
            for (int i = 0; i < n; i++) {
                if (j[i] + day * l[i] < s[i] + day * d[i]) {
                    found = false;
                    break;
                }
            }
            if (!found) {
                day++;
                if (day > 1000) { // 최대 1000일로 설정(문제의 조건에서 모든 능력은 1000 이하)
                    System.out.println("Strong is dark side of the force.");
                    return;
                }
            }
        }
        System.out.println(day);
    }
}
