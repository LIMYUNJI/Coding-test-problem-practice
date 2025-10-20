import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cards1Deque = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cards2Deque = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));
        
        while (!goalDeque.isEmpty()) { // goalDeque에 문자열이 남아 있을떄 까지 진행
            if (!cards1Deque.isEmpty() &&cards1Deque.peekFirst().equals(goalDeque.peekFirst())) {
                cards1Deque.pollFirst();
                goalDeque.pollFirst();
            } else if (!cards2Deque.isEmpty() &&cards2Deque.peekFirst().equals(goalDeque.peekFirst())) {
                cards2Deque.pollFirst();
                goalDeque.pollFirst();
            } else {
                break;
            }
        }
    
        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
