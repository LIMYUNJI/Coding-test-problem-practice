
class Solution {
    public int solution(int n, int k) {
        int meatPrice = n * 12000;              // 양꼬치 비용
        int freeDrink = n / 10;                 // 서비스 음료 개수
        int payDrink = Math.max(0, k - freeDrink); // 실제 돈 내는 음료 개수

        return meatPrice + payDrink * 2000;
    }
}
