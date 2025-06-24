improt java.util.ArrayDeque;
// BFS 문제 풀이

// 완주할때까지 움직인 칸수 return , 완주를 못하는 걍우 -1 return 

class Solution {
    int[] x = {1 ,-1 ,0 ,0};
    int[] y = {0, 0, 1, -1};

  static class Node {
    int co, ro;
    Node(int r, int c){
      this.r = r;
      this.c = c;
    }
  }
    public int solution(int[][] maps) {
      int n = maps.length;
      int m = maps[0].length;

      int [][] dist = new int [x][y]; 
      ArrayDeque<Interger> queue = new ArrayDeque<>();

      // 넓이 우선 탐색 구현
      queue.addLast(new Node(0, 0)));
      dist[0][0] = 1;

        // 큐가 빌떄까지 반복
        While(!queue.isEmpty()){
            Node node = queue.pollFist();
            f0r(){
                
            }
        }
      int answer = 0;
        return answer;
    }
}
