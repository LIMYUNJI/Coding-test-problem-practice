import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times){
        int max = Arrays.stream(times).max().getAsInt();

        long left = 1, right = (long) max * n;
        long answer = right;
     
        while(left <= right){
            long mid = (left + right)/2;
            long count = Arrays.stream(times).mapToLong(i -> mid / i).sum();
            
            if(count < n){
                left = mid + 1;
            } else {
                answer = mid;
                right = mid -1;
            }
        }
        
        return answer;
    }
}
