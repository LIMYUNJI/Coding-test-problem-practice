// 도시 N개가 일렬로 있고, 도시 i에서 i+1까지 가는 도로의 거리는 주어짐.
// 각 도시에 주유소가 있고, 리터당 가격이 주어짐.
// 첫 도시에서 마지막 도시까지 최소 비용으로 이동하려면 얼마가 드는지 구해야 함.
// 그리디 알고리즘을 이용한 문제 풀이
// - 최소 가격 주유소에서 최대한 많이 넣기.
// - 현재까지의 최소 기름값을 기억하면서, 그 가격으로 다음 도시까지 가는 거리를 계산.



import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] cost;  // 각 도시 주유소의 리터당 가격
    public static int[] road;  // 각 도로의 길이
    public static int minCost; // 현재까지의 최소 주유소 가격
    public static long totalCost; // 총 비용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        road = new int[N - 1];
        cost = new int[N];

        // 도로 길이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        // 주유소 가격 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        totalCost = 0;
        minCost = cost[0];  // 첫 도시의 주유소 가격으로 초기화

        // 각 도로를 순회하며 최소 비용 계산
        for (int i = 0; i < N - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];  // 더 싼 주유소 발견 시 갱신
            }
            totalCost += (long) minCost * road[i];  // 최소 가격으로 해당 거리만큼 비용 계산
        }

        System.out.println(totalCost);
    }
}
