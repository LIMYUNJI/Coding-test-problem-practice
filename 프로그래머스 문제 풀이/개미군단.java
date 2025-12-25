class Solution {
    public int solution(int hp) {
        int count = 0;

        // 장군개미 (공격력 5)
        count += hp / 5;
        hp %= 5;

        // 병정개미 (공격력 3)
        count += hp / 3;
        hp %= 3;

        // 일개미 (공격력 1)
        count += hp;

        return count;
    }
}
