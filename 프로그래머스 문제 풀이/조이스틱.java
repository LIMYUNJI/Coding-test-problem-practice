class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            answer += Math.min(ch - 'A', 'Z' - ch + 1);
        }
        
        int move = len - 1;
        
        for (int i = 0; i < len; i++) {
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(
                move,
                Math.min(
                    i * 2 + (len - next),
                    i + (len - next) * 2
                )
            );
        }
        
        return answer + move;
    }
}
