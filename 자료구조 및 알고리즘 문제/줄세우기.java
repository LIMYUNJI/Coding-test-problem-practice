/* N명의 아이들이 임의의 순서로 줄을 서 있을 때, 
 번호 순서대로 배치하기 위해 옮겨지는 아이의 최소 수를 구하는 프로그램을 작성하시오.*/

//  옮겨지는 아이의 수 = n-수열길이

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc. nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
    }
    List<Integer> list = ArrayList<>(); // 수열의 길이

    for(int num : arr){
      
    }
    System.out.println(N-list.size());
  }
}

