class Solution {
    public int solution(int n) {
        int pizza = 7;
        int answer = 0;
        
        while(n > 0){
            n -= pizza;
            answer ++;
        }
        
        return answer;
    }
}
