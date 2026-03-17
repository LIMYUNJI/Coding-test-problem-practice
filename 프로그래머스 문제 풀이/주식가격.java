import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 가격이 떨어진 경우
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        
        // 끝까지 가격이 안 떨어진 경우
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }
        
        return answer;
    }
}
