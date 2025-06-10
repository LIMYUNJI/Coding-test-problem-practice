/*
soo[t]가 1이 될 때만 철수 토핑 종류 수를 1 증가
bro1[t]가 0이 될 때 동생 토핑 종류 수를 1 감소
토핑을 하나씩 옮기면서 종류 수를 비교해 정답에 더함
*/

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        int [] soo = new int [10001]; // 철수가 가지는 토핑
        int [] bro1 = new int [10001]; // 동생이 가지는 토핑

        
        int soo_cnt = 0; // 철수 토핑 종류
        int bro1_cnt = 0;// 동생 토핑 종류

         // 동생이 모든 토핑을 먼저 가진 상태 세팅
        for(int i = 0; i < topping.length; i++){
            bro1[topping[i]]++;
            if(bro1[topping[i]] == 1) {
                bro1_cnt++;
            }
        }
        for(int i = 0; i <topping.length; i++){
            int t = topping[i];

            // 철수 토핑 추가
                soo[t]++;
            if( soo[t] == 1){ // 토핑 종류 추가 되는 경
                soo_cnt++;
            }

            // 철수 토핑이 증가 하므로 동생 토핑은 감소
                bro1[t]--;
            if( bro1[t] == 0){ // 동생 토핑 감
                bro1_cnt--;
            }
            
            if(soo_cnt == bro1_cnt){
                answer++;
            }
        }
        
        return answer;
    }
}
