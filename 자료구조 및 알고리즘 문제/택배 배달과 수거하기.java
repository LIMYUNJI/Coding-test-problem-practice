class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        int del = 0; // 배달상자
        int pick = 0; // 수거상자
        long answer = 0;
         
        // 물류창고에서 맨 마지막 집부터 배달시작
        for(int i = n - 1; i >= 0;i--){
            del += deliveries[i];
            pick += pickups[i];
        }
                int delCnt = 0; // 배달상자 수
                int pickCnt = 0; // 수거 상자 수
        
                // 현재까지 누적된 배달 또는 수거 상자가 남아있는 경우
                while(del > delCnt || pick > pickCnt){
                     // 돌아올때
                    del -= cap;
                    pick -= cap;
                     // 거리계산 (배달과 수거를 동시에 하기 때문에 왕복 *2)
                    answer +=  (i+1) * 2;
                }   
               
        }
           return answer; 
    }
        
}

