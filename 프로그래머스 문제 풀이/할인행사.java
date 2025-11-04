import java.util.HashMap;

/* 회원등록시 정현이가 원하는 제품을 모두 할인 
 받을 수 있는 회원등록 날짜의 총 일수를 return 
*/

class Solution { // want 원하는 제품 // 제품수량 // 할인하는 제춤
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        
        int answer = 0; // 총 일수를 정장할 변수 초기화
        // 10일 동안 회원 자격을 부여, 할인 품목 확인
        for(int i = 0; i < discount.length - 9; i++){
            // 회원가입시 할인받는 제품및 수량을 저장
            HashMap<String, Integer> discountpdt = new HashMap<>();
            for(int j = i; j < i + 10; j++){
                if(map.containsKey(discount[j])){// containsKey: 이 지도에 지정된 키에 대한 매핑이 포함되어 있으면 true를 반환합니다.
                    discountpdt.put(discount[j], discountpdt.getOrDefault(discount[j], 0) + 1);
                }
                
            }
        
        // 할인 하는 제품수가 내가 원하는 제품의 수와 일치 하는 경우
        if(discountpdt.equals(map)){
            answer++;
            }
        }
        
        return answer;
    }
}
