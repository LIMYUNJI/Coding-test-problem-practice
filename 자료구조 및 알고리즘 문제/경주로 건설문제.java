import java.util.ArrayList;

class Solution {
    class Node{
        int x, y, dest, cost;

       public Node(int x, int y, int dest, int cost){
            this.x = x;
            this.y = y;
            this.dest = dest;
            this.cost = cost;
        }
    }
    // 코너 계산
    int[] x = {0,0,-1,1};
    int[] y= {1,-1,0,0};
    public int solution(int N, int[][] road, int K) {
        ArrayList<Node>[] adjList = new ArrayList[N+1];
        int answer = 0;
        return answer;
    }
}
