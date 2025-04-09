import java.util.ArrayList;
import java.util.Collections;

class Solution{
  // 항공권 정보 2차원 배열 tickets 매개변수, 방문 하는 경로를 배열에 담아 return
  // 제한 사항
  // 모든 공항은 알파벳 대문자 3글자 
  // 주어진 공항의 수는 3개 이상 10,000이하
  // tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미
  // 주어진 항공권은 모두 사용할 것
  // 만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 
  // 모든 도시를 방문할 수 없는 경우는 주어지지 않음
  
  int n;
  boolean[] visited;
  ArrayList<String> arr = new ArrayList<>();

  // 사용한 공항권, 현재위치, 여행 경로, 항공권 정보
  public void back( int use, String start, String path, String[][] tickets){
    if(use == n){ // 사용한 항공권이 주어진 항공권 갯수와 같아지면
      arr.add(path);
      return;
    }
    for(int i =0; i < n; i++){
      if(!visited[[i] && tickets[i][0].equals(start)){
        visited[i] = true;
        back(use +1, tickets[i][0], path, " " + tickets[i][1], tickets);
        visited[i] = false;
      }
    }
  }
  
  public String[] solution(String[][] tickets){
    n = tickets.length;
    visited = new boolean[n+1];
    back(0, "ICN", "ICN", tickets);


    Collections.sort(arr);
    
    return arr.get(0).split(" ");
  }
}
