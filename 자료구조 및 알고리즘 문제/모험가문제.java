import java.util.*;
import java.io.*;

public class Solution{
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken()); // 모험가의 수
    ArrayList<Integer> list = new ArrayList<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i< n; i++){
      list.add(Integer.parseInt(st.nextToken()));
    } 
    // Arrays.sort(list); -- ArrayList에서 사용 불가능
    Collections.sort(list);// 공포도 기준으로 오름차순 정렬


  int answer = 0; // 총 모험가 그룹의 수
  int count = 0; // 현재 그룹에 포함된 모험가의 수
    
  for(int i = 0; i < n; i++) { // 공포도가 낮은 순으로 하나씩 확인
    count += 1; // 현재 그룹에 모험가를 포함 시키기
    if(count >= list.get(i)){
      answer += 1;// 총 그룹수 증가
      count = 0; // 그룹에 포함된 모험가의 수 초기화
  }

}
      System.out.println(answer);
      br.close();
}
    }
  
