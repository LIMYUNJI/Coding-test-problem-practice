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
        int last = 0; // 가장 마지막으로 전파가 닿는 곳

        for(int station : stations){
            int nosignal = station - w - 1; // 현재 기지국에 닿기 직전
            
        // 전파가 닿지 않는 경우
            if(last < nosignal){
                answer += stationsnum(stationwidth, last, nosignal);
            }
            last = station + w;
        }
   
        if(n - last > 0){
            answer += stationsnum(stationwidth, last, n);
        }
        
        return answer;
    }
}
