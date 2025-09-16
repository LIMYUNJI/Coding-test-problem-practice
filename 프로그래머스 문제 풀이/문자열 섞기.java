class Solution {
    public String solution(String str1, String str2) {
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        char[] answer = (str2 + str1).toCharArray();
        
        for(int i = 0; i < answer.length; i++){
            if( i % 2 == 0){ 
                answer[i] = str1Arr[i / 2];
            } else {
                answer[i] = str2Arr[i / 2];
            }
        }
        
        return new String(answer);
    }
}
