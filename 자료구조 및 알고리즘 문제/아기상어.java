// 아기 상어
// 이동과 동시에 물고기를 먹는다.
// 이동 결정 방법
// 먹을 수 있는 물고기가 공간에 없다면 아기 상어는 엄마상어에게 도움 요청
// 먹을 수 있는 물고기가 1마리면, 물고기 먹으러 이동
// 먹을 수 있는 물고기가 1마리 초과면, 거리가 가장 가까운 물고기를 먹으러감
// 거리는 아기 상어 -> 물고기가 있는 칸의 갯수의 최솟값
// 거리가 가까운 물고기가 많다면, 가장위에 있는 물고기, 위에도 여러 마리라면 가장 왼쪽에 있는 물고기 섭취
// 이동 시간 1초 물고기 먹는데 시간은 신경X
// 물고기를 먹으면 크기가 1증가
Q 아기 상어가 몇초 동안 엄마 상어에게 도움을 요청하지 않고 물고기를 잡아 먹을 수 있는지 구하는 프로그램을 작성하시오

import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int N;
    static int[][] map;
    static int sharkSize = 2;
    static int sharkRow, sharkCol;
    static int eating = 0;
    static int answer = 0;

    public static void bfs() {
        while (true) {
            Queue<int[]> queue = new ArrayDeque<>();
            boolean[][] visited = new boolean[N][N];
            int[][] dist = new int[N][N];

            queue.add(new int[]{sharkRow, sharkCol});
            visited[sharkRow][sharkCol] = true;

            List<int[]> fishList = new ArrayList<>();

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for (int d = 0; d < 4; d++) {
                    int nr = r + dx[d];
                    int nc = c + dy[d];

                    if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                    if (visited[nr][nc]) continue;
                    if (map[nr][nc] > sharkSize) continue;

                    queue.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                    dist[nr][nc] = dist[r][c] + 1;

                    if (map[nr][nc] != 0 && map[nr][nc] < sharkSize) {
                        fishList.add(new int[]{nr, nc, dist[nr][nc]});
                    }
                }
            }

            if (fishList.isEmpty()) break;

            fishList.sort((a, b) -> {
                if (a[2] != b[2]) return a[2] - b[2];
                if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            });

            int[] fish = fishList.get(0);
            int fishR = fish[0];
            int fishC = fish[1];
            int fishDist = fish[2];

            answer += fishDist;
            eating++;

            if (eating == sharkSize) {
                sharkSize++;
                eating = 0;
            }

            map[sharkRow][sharkCol] = 0;
            sharkRow = fishR;
            sharkCol = fishC;
            map[sharkRow][sharkCol] = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());
                map[i][j] = val;
                if (val == 9) {
                    sharkRow = i;
                    sharkCol = j;
                    map[i][j] = 0; // 상어 초기 위치 초기화
                }
            }
        }

        bfs();
        System.out.println(answer);
    }
}
