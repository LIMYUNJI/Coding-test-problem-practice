class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        // 8방향 (상, 하, 좌, 우 + 대각선)
        int[] dx = {-1,-1,-1, 0,0, 1,1,1};
        int[] dy = {-1, 0, 1,-1,1,-1,0,1};

        // 지뢰 기준으로 위험 지역 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true; // 지뢰 위치도 위험
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                            danger[nx][ny] = true;
                        }
                    }
                }
            }
        }

        // 안전한 지역 카운트
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) count++;
            }
        }

        return count;
    }
}
