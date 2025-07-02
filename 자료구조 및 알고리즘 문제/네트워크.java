class Solution{
    private static boolean[] visit;
    private static int[][] com;

    private static void dfs(int now){
      visit[now] = true;
      for(int i = 0; i<com[now].length; i++){
        if(com[now][i] == 1 && !visit[i]){
          dfs(i);
        }
      }
    }

  public int solution(int n, int [][] coms){
    int result = 0;
    com = coms;
    visit = new boolean[n];

    for(int i = 0; i< n; i++){
      if(!visit[i]){
        dfs(i);
        result++;
      }
    }

    return result;
  }
  
}
