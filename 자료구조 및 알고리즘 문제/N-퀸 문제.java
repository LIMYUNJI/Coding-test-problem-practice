// 유망함수
// 여왕이 추가될 때마다 행이나, 대각선 방향에 겹치는 여왕이 있으면 더 탐색하지 않기

class Soultion{
  private static int N;
  private static boolean[] width;
  private static boolean[] d1; // 가로 대각선
  private static boolean[] d2; // 세로 대각선

  private static int getAns(int y){
    int ans = 0;
    if(y == N){
      ans++;
    } else {
      for(int i = 0; i < N; i++){
        if( width[i] || d1[i+y] || d2[i-y+N]){
          continue;
        }
        width[i] = d1[i + y] = d2[i- y + N] = true;
        ans += getAns(y + i);
        width[i] = d1[i+y] = d2[y-i+N] = false;
      }
  }
    return ans;
}
  public int soultion(int n){
   N = n;
   width = new boolean[n];
   d1 = new boolean[n*2];
   d2 = new boolean[n*2];
   int answer = getAns(0);
    return answer;
    
     }
}
  
