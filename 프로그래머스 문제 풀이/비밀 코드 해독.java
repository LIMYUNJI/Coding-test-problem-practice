import java.util.*;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        List<int[]> combs = new ArrayList<>();
        makeComb(n, combs);

        int count = 0;
        for (int[] code : combs) {
            if (check(code, q, ans)) count++;
        }
        return count;
    }

    private void makeComb(int n, List<int[]> combs) {
        int[] temp = new int[5];
        dfs(1, n, 0, temp, combs);
    }

    private void dfs(int start, int n, int depth, int[] temp, List<int[]> combs) {
        if (depth == 5) {
            combs.add(temp.clone());
            return;
        }
        for (int i = start; i <= n; i++) {
            temp[depth] = i;
            dfs(i + 1, n, depth + 1, temp, combs);
        }
    }

    private boolean check(int[] code, int[][] q, int[] ans) {
        Set<Integer> set = new HashSet<>();
        for (int c : code) set.add(c);

        for (int i = 0; i < q.length; i++) {
            int match = 0;
            for (int x : q[i]) {
                if (set.contains(x)) match++;
            }
            if (match != ans[i]) return false;
        }
        return true;
    }
}
