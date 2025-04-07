import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<Integer>[] subwayline;     // 노선별 역 리스트
    static ArrayList<Integer>[] station;        // 역별 노선 리스트
    static boolean[] visitedStation;
    static boolean[] visitedSubwayLine;
    static int N, L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 역의 개수
        L = Integer.parseInt(st.nextToken()); // 노선 수

        subwayline = (ArrayList<Integer>[]) new ArrayList[L + 1];     // 1번 ~ L번 노선
        station = (ArrayList<Integer>[]) new ArrayList[N + 1];        // 1번 ~ N번 역
        visitedStation = new boolean[N + 1];
        visitedSubwayLine = new boolean[L + 1];

        for (int i = 1; i <= L; i++) {
            subwayline[i] = new ArrayList<>();
        }
        for (int i = 1; i <= N; i++) {
            station[i] = new ArrayList<>();
        }

        // 노선 입력 처리
        for (int i = 1; i <= L; i++) {
            st = new StringTokenizer(br.readLine());
            while (true) {
                int s = Integer.parseInt(st.nextToken());
                if (s == -1) break;
                subwayline[i].add(s);
                station[s].add(i);
            }
        }

        // 출발역, 도착역 입력
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        // 출발과 도착이 같을 경우
        if (start == end) {
            System.out.println(0);
        } else {
            int result = bfs(start, end);
            System.out.println(result);
        }
    }

    static int bfs(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> transferQ = new LinkedList<>();

        // 출발역과 연결된 모든 노선을 먼저 큐에 넣음
        for (int line : station[start]) {
            q.add(line);
            visitedSubwayLine[line] = true;
        }

        visitedStation[start] = true;
        int transfer = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            transfer++;

            for (int i = 0; i < size; i++) {
                int curLine = q.poll();

                for (int s : subwayline[curLine]) {
                    if (s == end) return transfer;

                    if (!visitedStation[s]) {
                        visitedStation[s] = true;

                        // 이 역에 연결된 다른 노선들 확인
                        for (int nextLine : station[s]) {
                            if (!visitedSubwayLine[nextLine]) {
                                visitedSubwayLine[nextLine] = true;
                                transferQ.add(nextLine);
                            }
                        }
                    }
                }
            }

            q.addAll(transferQ);
            transferQ.clear();
        }

        return -1; 
    }
}
