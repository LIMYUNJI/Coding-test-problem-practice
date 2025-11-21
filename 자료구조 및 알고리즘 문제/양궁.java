// 백트래킹 + 조합
// 라이언이 가장 큰 점수 차이로 우승하기 위해 n발의 화살을 어떤 과녁에 맞출지 결정
// 결과는 길이 11 배열, 우승 불가 시 -1 리턴
class Solution {

    int[] ryan = new int[11];
    int[] apeach = new int[11];
    int maxDiff = 0;
    int[] answer = {-1};
    int N;

    public int[] solution(int n, int[] info) {
        this.N = n;
        this.apeach = info.clone();

        dfs(0, n);

        return answer;
    }

    // idx: 현재 과녁 (0~10)
    // arrows: 남은 화살
    private void dfs(int idx, int arrows) {
        // 마지막까지 봤거나 화살이 다 떨어짐
        if (idx == 11) {
            // 남은 화살은 0점(마지막)에 몰아줌
            ryan[10] += arrows;

            int diff = getScore();
            if (diff > maxDiff) {
                maxDiff = diff;
                answer = ryan.clone();
            } else if (diff == maxDiff && diff > 0) {
                // 조건: 더 낮은 점수부터 많이 맞힌 사람이 우선
                if (isBetter(ryan, answer)) {
                    answer = ryan.clone();
                }
            }

            ryan[10] -= arrows; // 백트래킹
            return;
        }

        // 1) 이 과녁을 이기기 위해 필요한 화살
        int need = apeach[idx] + 1;

        // (1) 이 점수를 먹는 경우
        if (arrows >= need) {
            ryan[idx] = need;
            dfs(idx + 1, arrows - need);
            ryan[idx] = 0; // 백트래킹
        }

        // (2) 이 점수를 포기하는 경우
        dfs(idx + 1, arrows);
    }

    // 라이언 점수 - 어피치 점수
    private int getScore() {
        int rScore = 0;
        int aScore = 0;

        for (int i = 0; i <= 10; i++) {
            if (ryan[i] == 0 && apeach[i] == 0) continue;

            if (ryan[i] > apeach[i]) {
                rScore += (10 - i);
            } else {
                aScore += (10 - i);
            }
        }

        if (rScore <= aScore) return 0;  // 우승 불가

        return rScore - aScore;
    }

    // 점수 차이 tie-break 규칙
    private boolean isBetter(int[] curr, int[] best) {
        for (int i = 10; i >= 0; i--) {
            if (curr[i] > best[i]) return true;
            else if (curr[i] < best[i]) return false;
        }
        return false;
    }
}
