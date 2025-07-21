import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  private static class Node{
    int x, y, num;
    Node left, reight;

    public Node(int x, int y, int num){
      this.x = x;
      this.y = y;
      this.num = num;
    }
  }
   List<Integer> preorderList = new ArrayList<>();
   List<Integer> postorderList = new ArrayList<>();

    public int[][] solution(int[][] nodeinfo) {
        int n = nodeinfo.length;
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1);
        }
}
