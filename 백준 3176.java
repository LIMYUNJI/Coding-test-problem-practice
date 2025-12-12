import java.io.*;
import java.util.*;

public class Main {
    static int N, LOG;
    static ArrayList<Node>[] graph;
    static int[][] parent;
    static int[][] minDist;
    static int[][] maxDist;
    static int[] depth;

    static class Node {
        int v, w;
        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        LOG = (int)Math.ceil(Math.log(N) / Math.log(2));

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[a].add(new Node(b, w));
            graph[b].add(new Node(a, w));
        }

        parent = new int[LOG + 1][N + 1];
        minDist = new int[LOG + 1][N + 1];
        maxDist = new int[LOG + 1][N + 1];
        depth = new int[N + 1];

        // 깊이 및 1번 부모 설정
        bfs(1);

        // 희소배열 구축
        buildSparse();

        int Q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int[] ans = query(u, v);
            sb.append(ans[0]).append(" ").append(ans[1]).append("\n");
        }

        System.out.print(sb);
    }

    // BFS로 depth, parent[0], minDist[0], maxDist[0] 초기화
    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        visited[start] = true;
        depth[start] = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (Node nx : graph[cur]) {
                if (!visited[nx.v]) {
                    visited[nx.v] = true;
                    depth[nx.v] = depth[cur] + 1;

                    parent[0][nx.v] = cur;
                    minDist[0][nx.v] = nx.w;
                    maxDist[0][nx.v] = nx.w;

                    q.add(nx.v);
                }
            }
        }
    }

    // 2^k 단위 점프 부모 구성
    static void buildSparse() {
        for (int k = 1; k <= LOG; k++) {
            for (int v = 1; v <= N; v++) {
                int p = parent[k - 1][v];
                parent[k][v] = parent[k - 1][p];

                minDist[k][v] = Math.min(minDist[k - 1][v], minDist[k - 1][p]);
                maxDist[k][v] = Math.max(maxDist[k - 1][v], maxDist[k - 1][p]);
            }
        }
    }

    static int[] query(int u, int v) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        // 깊이 맞추기
        if (depth[u] < depth[v]) {
            int tmp = u; u = v; v = tmp;
        }

        int diff = depth[u] - depth[v];
        for (int k = 0; diff > 0; k++) {
            if ((diff & 1) == 1) {
                min = Math.min(min, minDist[k][u]);
                max = Math.max(max, maxDist[k][u]);
                u = parent[k][u];
            }
            diff >>= 1;
        }

        // 이미 같다면 LCA
        if (u == v) return new int[]{min, max};

        // 위로 동시에 올리기
        for (int k = LOG; k >= 0; k--) {
            if (parent[k][u] != parent[k][v]) {
                min = Math.min(min, Math.min(minDist[k][u], minDist[k][v]));
                max = Math.max(max, Math.max(maxDist[k][u], maxDist[k][v]));
                u = parent[k][u];
                v = parent[k][v];
            }
        }

        // 마지막 직전 부모 처리
        min = Math.min(min, Math.min(minDist[0][u], minDist[0][v]));
        max = Math.max(max, Math.max(maxDist[0][u], maxDist[0][v]));

        return new int[]{min, max};
    }
}

