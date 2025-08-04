import java.util.Arrays;
// 출 ~ 도착 거리 distance, 바위위치 rocks, 바위 수 = n
// 모든 바위를 제거 한 경우
public class Solution{
	private boolean isValid(int d, int[] rocks, int n){
		int remove = 0;
		int last = 0;

		for(int rock : rocks){
			if(rock - last < d){
				remove++;
				continue;
        }
			last = rock;
    }
	return remove <=n;
}

public int solution(int distance, int[] rocks, int n){
	// 모든 바위를 제거 할 수 있는 경우
    if(n >= rocks.length){
        return distance;
    }
    
    rocks = Arrays.copyOf(rocks, rocks.length +1);
	rocks[rocks.length - 1] = distance;
	Arrays.sort(rocks); 

	int start = 1;
	int end = distance + 1;

	while(end - start > 1){
		int d = (start + end)/2;
        if(isValid(d, rocks, n)){
            start = d;
        } else {
            end = d;
        }
        
        }
    
	return start;
    }
}
