import java.util.*;

class Solution {

    int n;
    boolean[][] visited;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int solution(int[][] game_board, int[][] table) {
        n = game_board.length;

        // 1. 빈칸(0) 도형 추출
        visited = new boolean[n][n];
        List<List<int[]>> blanks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (game_board[i][j] == 0 && !visited[i][j]) {
                    blanks.add(dfs(game_board, i, j, 0));
                }
            }
        }

        // 2. 퍼즐(1) 도형 추출
        visited = new boolean[n][n];
        List<List<int[]>> puzzles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (table[i][j] == 1 && !visited[i][j]) {
                    puzzles.add(dfs(table, i, j, 1));
                }
            }
        }

        boolean[] used = new boolean[puzzles.size()];
        int answer = 0;

        // 3. 빈칸과 퍼즐 매칭
        for (List<int[]> blank : blanks) {
            for (int i = 0; i < puzzles.size(); i++) {
                if (used[i]) continue;
                if (blank.size() != puzzles.get(i).size()) continue;

                List<int[]> puzzle = puzzles.get(i);

                if (isMatch(blank, puzzle)) {
                    used[i] = true;
                    answer += blank.size();
                    break;
                }
            }
        }

        return answer;
    }

    // DFS로 하나의 도형 추출
    List<int[]> dfs(int[][] board, int x, int y, int target) {
        List<int[]> shape = new ArrayList<>();
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            shape.add(new int[]{cur[0], cur[1]});

            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (visited[nx][ny]) continue;
                if (board[nx][ny] != target) continue;

                visited[nx][ny] = true;
                stack.push(new int[]{nx, ny});
            }
        }

        return normalize(shape);
    }

    // 좌표 정규화
    List<int[]> normalize(List<int[]> shape) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int[] p : shape) {
            minX = Math.min(minX, p[0]);
            minY = Math.min(minY, p[1]);
        }

        List<int[]> result = new ArrayList<>();
        for (int[] p : shape) {
            result.add(new int[]{p[0] - minX, p[1] - minY});
        }

        result.sort((a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        return result;
    }

    // 퍼즐 회전
    List<int[]> rotate(List<int[]> shape) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] p : shape) {
            rotated.add(new int[]{p[1], -p[0]});
        }
        return normalize(rotated);
    }

    // 빈칸과 퍼즐 비교
    boolean isMatch(List<int[]> blank, List<int[]> puzzle) {
        List<int[]> cur = puzzle;

        for (int r = 0; r < 4; r++) {
            if (sameShape(blank, cur)) return true;
            cur = rotate(cur);
        }
        return false;
    }

    // 도형 동일 여부 확인
    boolean sameShape(List<int[]> a, List<int[]> b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)[0] != b.get(i)[0] ||
                a.get(i)[1] != b.get(i)[1]) {
                return false;
            }
        }
        return true;
    }
}

