import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0){
            System.out.println(n + " is even");
        } else if(n % 2 == 1){
            System.out.println(n + " is odd");
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }
        
    }
}
