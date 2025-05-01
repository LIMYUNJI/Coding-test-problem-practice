class Solution {
    int answer = 0;
    public void dfs(int index, int sum, int[] numbers, int target){
        if(index == numbers.length){
            if(sum == target){
                answer++;
        }
            return;
    }
        dfs(index + 1, sum + numbers[index], numbers, target); // 플러스
        dfs(index + 1, sum - numbers[index], numbers, target); // 마이너스
    }
     
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target); // 재귀 함수
        return answer;
    }
}

