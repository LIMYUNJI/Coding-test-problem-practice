// 예산문제
// d[] : 부서별로 신청한 금액의 배열
// d.length: 총 부서의 갯수
// d안의 요소 : 부서별로 신청한 금액
// budget : 예산
// 최대 몇개의 부서에 물품을 지원할 수 있는지 구하는 문제 (result)

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int depart= d.length;
        int result = 0;
        
        for(int i = 0; i < depart; i++){
            sum += d[i];
            if(sum > budget){
                return result;
                
            } else {
                result ++;
            }
            
        }
        
        return result;
    }
}
