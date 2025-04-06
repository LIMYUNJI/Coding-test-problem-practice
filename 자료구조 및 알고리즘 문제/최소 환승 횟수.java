// 첫번째 줄에 역의 갯수 N, 노선갯수 L(노선이 지나는 역이 순서대로 주어지고 각 줄의 마지막에는 -1),
// 마지막 줄에는 출발역 번호와 목적지 역의 번호

import java.util.ArrayList;
import java.io.*;

public class Main{

  static ArrayList<Integer> [] subwayline, station;
  static int N, L;
  static boolean[] visitedstation;
  static boolean[] visitedsubwayline;
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferdWriter(new OutStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    L = Integer.parseInt(st.nextToken());

    subwayline = new ArrayList[N+1];
    station = new ArrayList[L+1];
    
    visitedstation = new boolean[N+1];
    visitedsubwayline = new boolean[L+1};

    for(int i = 1; i <= N; i++){
      subwayline[i] = new ArrayList<>();
    }
    for(int i = 1; i <= L; i++){
      station[i] = new ArrayList<>();
    }
    for(int i = 1; i <=L; i++){
      st = new StringTokenizer(br.readLine());
    }
      while(ture){
        int stations = Integer.parseInt(st.nextToken());
        if(stations == -1) break;
            subwayline[i].add(stations);
            station[stations].add(i);
      }
    
}
