// 아파트 수 N
// 전파가 닿는 범위 W
// 이미 설치된 기지국의 갯수 : STATIONS
// 모든 아파트에 증설해야할 기지국의 최소갯수 구하는 문제

class Solution {
    // 전파가 닿지 않는 구간에 필요한 기지국의 수를 구하는 함수
    private int stationsnum(int stationwidth, int last, int nosignal){
        int length = nosignal - last;
        return (int)Math.ceil((double)length / stationwidth);
    }
    
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int stationwidth = w * 2 + 1;
        int last = 0; 

        for(int station : stations){
            int nosignal = station - w - 1;  // 현재 기지국 왼쪽 끝 이전 지점
            
        // 전파가 닿지 않는 경우 기지국 설치
            if(last < nosignal){
                answer += stationsnum(stationwidth, last, nosignal);
            }
            // 가장 마지막으로 전파가 닿은 위치
            last = station + w;
        }
        
        // 마지막으로 기지국 이후에도 닿지 않는 구간이 있는 경우 추가 설치
        if(n - last > 0){
            answer += stationsnum(stationwidth, last, n);
        }
        
        return answer;
    }
}
