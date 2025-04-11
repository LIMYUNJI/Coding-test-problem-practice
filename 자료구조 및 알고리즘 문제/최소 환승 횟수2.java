import java.io.*;
import java.util.*;

public class Main{
  static class Node{
    int to, count;
    public Node(int count, in to){
      this.count = count;
      this.to = to;
    }
  }
  static int N, L, Start, End;
  static List<Integer>[]  route, edges;

  public static void mian(String[] args) throws IOException{
    BufferdReader br = new BufferdReader(new InputStreamReader(System.in));
    BufferdWriter bw = new BufferdWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    L = Integer.parseInt(st.nextToken());
    route = new ArrayList[L+1];
    for(int i = 0; i <=L; i++){
      route[i] = newArrayList<>()'
    }
    for(int i = 0; i <=N; i++){
      edges[i] = newArrayList<>()'
    }   
    for(int i =1; i <=L; i++){
        String[] str = br.readLine().split(" ");
        for(int j = 0; j < str.length - 1; ++j){
          int station = Integer.parseInt(str[j]);
          route[i].add(station);
          edges[station].add[i];
        }
    }
        st = new StringTokenizer(br.readLine());
        Start = Integer.parseInt(st.nextToken());
        End = Integer.parseInt(st.nextToken());
        bw.write(bfs() + "\");
    
  }
}
    public static bfs(){
      // 너비 우선 탐색을 위한 구현 부분
    }
