import java.util.*;
import java.io.*;

public class Solution{
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferReader(new InputSteamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Interger.parseInt(st.nextToken()));
    ArrayList<Interger> list = new ArrayList<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i< n; i++){
      list.add(Interger.parseInt(st.nextToken()));
    } 
    Arrays.sort(list);
  }

  int answer = 0;
  int count = 0;
  for(int i = 0; i < n; i++){
    count +=1;
  }
}
  
