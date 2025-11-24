import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    private final int[] dx = {0,0,1,-1};
    private final int[] dy = {1,-1,0,0};
    
    // 방문 여부
    private boolean[][] visited;
    
    // 지도 크기
    private int T,L;
    
    public int[] solution(String[] maps) {
        T = maps.length;
        L = maps[0].length();
        visited = new boolean[T][L];
        
        // 결과를 저장할 리스트 (각 무인도의 식량 합계)
        List<Integer> result = new ArrayList<>();
        
        // 지도 전체 순회
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < L; j++) {
                // 'X'가 아니면서 아직 방문하지 않은 칸을 발견하면 새로운 무인도 탐색 시작
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    int days = bfs(i, j, maps);
                    result.add(days);
                }
            }
        }
        
        // 1. 결과 오름차순 정렬
        Collections.sort(result);
        
        // 2. 무인도가 하나도 없는 경우 [-1] 반환
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        // 3. 리스트를 int 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    // BFS 탐색 메서드
    private int bfs(int startX, int startY, String[] maps) {
        // Queue<int[]>: {x, y} 좌표를 담기 위한 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        
        // 현재 무인도에서 머무를 수 있는 기간 (식량 합계)
        // char '1'은 ASCII 값 49이므로, '0'의 ASCII 값 48을 빼야 정수 1이 됨.
        int answer = maps[startX].charAt(startY) - '0';
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            // 상, 하, 좌, 우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 1. 지도 범위 체크
                if (nx >= 0 && nx < T && ny >= 0 && ny < L) {
                    // 2. 바다가 아니고 (maps[nx].charAt(ny) != 'X')
                    // 3. 아직 방문하지 않았다면 (!visited[nx][ny])
                    if (maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        
                        answer += maps[nx].charAt(ny) - '0';
                    }
                }
            }
        }
        
        return answer;
    }
}
