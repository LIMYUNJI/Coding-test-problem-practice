// (유니온-파인트 알고리즘), 최소 비용(최소신장트리)
// 유망 함수:  최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용을 return
// costs[i][0] 와 costs[i] [1]에는 다리가 연결되는 두 섬의 번호
// costs[i] [2]에는 이 두 섬을 연결하는 다리를 건설할때 드는 비용
import java.util.Arrays;

class Solution {
    private static int[] parent;
    
    public int find(int n){
        if(parent[n] == n){
            return n;    
        } else {
            parent[n] = find(parent[n]);
            return parent[n];
            
    }
}
    
    public void union(int x, int y){
        int root1 = find(x);
        int root2 = find(y);
        
        parent[root2] = root1;
    
    public int solution(int n, int[][] costs) {
        
        parent = new int[n];
     
        for(int i = 0; i< n; i++){
            parent[i] = i;
        }

      
        int cost = 0;
        for(int i = 0; i< costs.length; i++){
            int a = costs[i][0];
            int b = costs[i][1];
            int c = costs[i][2];
        
                if(find(a) != find(b)){
                    union(a,b);
                    cost += c;
                }
            }
        
        return cost;
    }
}
