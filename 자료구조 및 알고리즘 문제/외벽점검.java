 // n: 외벽의 길이, weak 취약지점의 위치, dist 친구들이 이동할 수 있는 거리
import java.util.*;

class Solution {
    private static int[] weak, dist;
    private static boolean[] visited;
    private static List<int[]> a = new ArrayList<>();
    private static int n;

    // 외벽 점검 가능한지 확인
    private static boolean check(int[] order) {
        int len = weak.length;
        int[] extended = new int[len * 2];
        for (int i = 0; i < len; i++) {
            extended[i] = weak[i];
            extended[i + len] = weak[i] + n; // 원형 구조 때문에 확장
        }

        // weak[i]부터 시작하는 모든 경우 확인
        for (int start = 0; start < len; start++) {
            int count = 0;
            int position = extended[start] + order[count];

            boolean visited = true;
            for (int i = start; i < start + len; i++) {
                if (extended[i] > position) {
                    count++;
                    if (count >= order.length) {
                        visited = false;
                        break;
                    }
                    position = extended[i] + order[count];
                }
            }

            if (visited == true ) {
return true;
}
        }

        return false;
    }

    private static void back(List<Integer> list) {
        if (list.size() == dist.length) {
            a.add(list.stream().mapToInt(Integer::intValue).toArray());
            return;
        }

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(dist[i]);
                back(list);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }

    public int solution(int n_, int[] weak_, int[] dist_) {
        n = n_;
        weak = weak_;
        dist = dist_;
        visited = new boolean[dist.length];

        back(new ArrayList<>());

        for (int i = 1; i <= dist.length; i++) {
            for (int[] check : a) {
                int[] pickup = Arrays.copyOf(check, i);
                if (check(pickup)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
