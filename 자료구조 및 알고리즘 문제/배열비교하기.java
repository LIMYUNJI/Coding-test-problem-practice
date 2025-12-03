class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        if (arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                return 1;
            }
                return -1;
        }
            for (int i : arr1) {
                sum1 += i;
            }
            for (int i : arr2) {
                sum2 += i;
            }
            if (sum1 == sum2) {
                return 0;
              
            } else {
                return sum1 > sum2 ? 1 : -1;
            }
        }
        
}   
