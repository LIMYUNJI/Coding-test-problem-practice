// 기본 체력 회복량: 1초당 bandage[1]만큼 회복
//  연속 성공 회복 보너스: bandage[0]초 연속 회복 성공 시, 추가로 bandage[2]만큼 더 회복
// 몬스터 공격 정보: attacks 배열. [시간, 피해량] 
// 매초 마다 몬스터가 공격시 : 체력감소, 연속 회복 카운트 초기화
// 공격이 없는 경우: 체력 회복, 연속 회복성공 여부에 따라 보너스 회복 적용

// 제약: 체력이 0이하로 떨어지면 즉시 사망, -1 반환
// 최대체력 이상으로 회복 불가능


class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxheal = health;
        int time = 0;
        int attacksidx = 0;
        int combo = 0;
        
        return health;
    }
}
