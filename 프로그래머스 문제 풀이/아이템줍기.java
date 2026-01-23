import java.util.*;

class Solution {

    static int[][] map = new int[102][102];
    static boolean[][] visited = new boolean[102][102];

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int solution(int[][] rectangle, int characterX, int characterY,
                        int itemX, int itemY) {

        // 1. 좌표 2배로 맵 채우기
        for (int[] r : rectangle) {
            int x1 = r[0] * 2;
            int y1 = r[1] * 2;
            int x2 = r[2] * 2;
            int y2 = r[3] * 2;

            // 내부 채우기
            for (int x = x1 + 1; x < x2; x++) {
                for (int y = y1 + 1; y < y2; y++) {
                    map[x][y] = 0;
                }
            }

            // 테두리 채우기
            for (int x = x1; x <= x2; x++) {
                if (map[x][y1] != 0) map[x][y1] = 1;
                if (map[x][y2] != 0) map[x][y2] = 1;
            }

            for (int y = y1; y <= y2; y++) {
                if (map[x1][y] != 0) map[x1][y] = 1;
                if (map[x2][y] != 0) map[x2][y] = 1;
            }
        }

        return bfs(characterX * 2, characterY * 2,
                   itemX * 2, itemY * 2) / 2;
    }

    static int bfs(int sx, int sy, int ex, int ey) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy, 0});
        visited[sx][sy] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == ex && y == ey) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= 102 || ny >= 102) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                q.add(new int[]{nx, ny, dist + 1});
            }
        }
        return 0;
    }
}
