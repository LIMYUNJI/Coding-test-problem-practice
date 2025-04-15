class Solution{
  private static int size = 0; // 외변의 크기
  private static int[] weak, dist;
  private static boolean visited;
  private static List<List<Integer>> a = new ArrayList<>(); // 모든 순서를 담을 배
  // n: 외벽의 길이, weak 취약지점의 위치, dist 친구들이 이동할 수 있는 거리

  //  입력받은 친구들이 외벽 점검이 가능한지
  private static boolean check(int[] dist){
    // 외벽을 0 ~ 외벽길이 까지 확인
    for(int i = 0; i < n; i++){
      
    }
      if(){  
        return true;
  }
        return false;
  }

  // 백트래킹을 이용한 친구들 위치 순서에 대한 모든 경우의 수 구하기
  public static void back(List<Integer>list){
    if(list.size()> dist.length){
      a.add(list);
      return;
    }
    for(int i =0; i <dist.length; i++){
      if(!visted[i]){
        continue;
        visited[i] = true;
        list.add(dist[i]);
        // 재귀
        back(new ArrayList<Integer> list))
        visited[i] = false;
        list.remove(list.size()-1);
      }
    }
  }
  
  public int solution(int n, int[] weak, int[] dist){
    Weak = weak;
    return result;
  }
}
