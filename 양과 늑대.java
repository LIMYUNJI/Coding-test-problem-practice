import java.util.*;

class Solution {
    int maxSheep = 0; // 최종 최대 양의 수
    int[] info;
    List<Integer>[] tree;

    public int solution(int[] info, int[][] edges) {
        this.info = info;
        int n = info.length;
        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        // 간선 연결
        for (int[] e : edges) {
            tree[e[0]].add(e[1]);
        }

        // DFS 시작: 현재 노드, 양 수, 늑대 수, 방문 가능한 리스트
        dfs(0, 0, 0, new ArrayList<>(List.of(0)));

        return maxSheep;
    }

    private void dfs(int node, int sheep, int wolf, List<Integer> nextNodes) {
        // 현재 노드의 동물 수 세기
        if (info[node] == 0) sheep++;
        else wolf++;

        // 늑대가 양보다 많아지면 중단
        if (wolf >= sheep) return;

        // 최대 양 갱신
        maxSheep = Math.max(maxSheep, sheep);

        // 다음 탐색 가능한 노드 목록 갱신
        List<Integer> list = new ArrayList<>(nextNodes);
        list.remove(Integer.valueOf(node)); // 현재 노드 제거
        list.addAll(tree[node]);             // 자식 노드 추가

        // 다음 노드들 탐색
        for (int next : list) {
            dfs(next, sheep, wolf, list);
        }
    }
}
