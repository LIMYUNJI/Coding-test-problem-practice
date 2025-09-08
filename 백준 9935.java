import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main{
    static char[] origin;
    static char[] bomb;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        origin = br.readLine().toCharArray();
        bomb = br.readLine().toCharArray();
        int bombIdx = bomb.length - 1;
        ArrayDeque<Character> deque = new ArrayDeque<Character>();
  }
}
