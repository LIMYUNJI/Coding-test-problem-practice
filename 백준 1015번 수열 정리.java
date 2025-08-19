import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // (값, 원래 인덱스) 저장
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = A[i]; // 값
            arr[i][1] = i;    // 원래 인덱스
        }

        // 값 기준 정렬
        Arrays.sort(ar
