import java.util.ArrayDeque;
import java.io.*;


public class Main{
  public static void main(String[] args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
    
      ArrayDeque<Integer> stack = new ArrayDeque<>();
  
       for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String token = st.nextToken();

            if (token.equals("1")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (token.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            } else if (token.equals("3")) {
                sb.append(token.size()).append('\n');
            } else if (token.equals("4")) { 
                sb.append(token.isEmpty() ? 1 : 0).append('\n');
            } else if (token.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
        }
        System.out.print(sb);
  } 
  
}
