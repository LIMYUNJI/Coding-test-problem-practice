import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
	private static class Node{
		int dest, cost;

	public Node(int dest, int cost){
		this.dest = dest;
		this.cost = cost;
}
}
// static 정적 초기화
    public int solution(int N, int[][] road, int K) {
// 인접 리스트를 저장할 ArrayList 배열 초기화        
ArrayList<Node>[] adjList = new ArrayList[N+1];
        for(int i = 1; i <=N; i++){
            adjList[i] = new ArrayList<>();
        }
 // 도로 정보를 인접 리스트에 저장
        for (int[] r : road) {
	    // 양방향 도로이기 때문에
            adjList[r[0]].add(new Node(r[1], r[2]));
            adjList[r[1]].add(new Node(r[0], r[2]));
        }        

        int[] dist = new int[N+1];
// 모든 노드의 거리 값을 무한대로 초기화
	Arrays.fill(dist, Integer.MAX_VALUE);
	PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2) -> Integer.compare(o1.cost, o2.cost));
	pq.add(new Node(1,0));
dist[1] = 0;
	While(!pq.isEmpty()){
		Node now = pq.poll();
	if(dist[now.dest] < now.cost)
	continue;	

	for(Node next : adjList[now.dest]){
		if(dist[next.dest] > now.cost + next.cost){
			dist[next.dest] = now.cost + next.cost;
			pq.add(new Node(next.dest, dis[next.dest]));

}
	}
}

        int answer = 0;
for (int i = 1; i <=N; i++){
	if(dist[i] <=K)answer++;	
}
return answer;
    }
}
