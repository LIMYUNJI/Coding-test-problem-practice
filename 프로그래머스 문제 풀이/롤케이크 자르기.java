class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        int [] soo = new int [10001]; // 철수가 가지는 토핑
        int [] bro1 = new int [10001]; // 동생이 가지는 토핑

        
        int soo_cnt = 0; // 철수 토핑 종류
        int bro1_cnt = 0;// 동생 토핑종류

        for(int i = 0; i < topping.length; i++){
            bro1[topping[i]]++;
            if(bro1[topping[i]] == 1) bro1_cnt++;
        }
        for(int i = 0; i <topping.length; i++){
            if(){
                soo_cnt++;
                bro1_cnt--;
            }
            if(){
                soo_cnt--;
                bro1_cnt++;
            }
            
            if(soo_cnt == bro1_cnt){
                answer++;
            }
        }
        
    }
        return answer;
    }
}
