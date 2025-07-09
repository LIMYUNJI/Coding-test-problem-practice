import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        // 큐에 [index, priority] 형태로 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 맨 앞 문서 꺼냄
            boolean hasHigher = false;

            // 하나라도 우선순위가 높은 문서가 남아 있으면 다시 큐에 추가
            for (int[] doc : queue) {
                if (doc[1] > current[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                queue.add(current); // 다시 뒤로
            } else {
                answer++; // 출력
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
