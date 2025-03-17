import java.util.*;

public class Soultion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        Arrays.sort(coins); 

        int target = 1; 
        for (int coin : coins) {
            if (coin > target) { 
                break;
            }
            target += coin; 
        }

        System.out.println(target);
    }
}
