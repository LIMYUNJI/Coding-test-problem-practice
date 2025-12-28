// 두 수의 차 구하기, 나이 출력, 편지, 배열자르기

class Solution {
    public int solution(int num1, int num2) {
        
        double d1 = num1;
        double d2 = num2;
        
        int answer = (int)(d1 / d2 * 1000) ;
        return answer;
    }
}

class Solution {
    public int solution(int age) {
        int year = 2022;
        int answer = year - age + 1;
        
        return answer;
    }
}

class Solution {
    public int solution(String message) {
        int m = message.length();
        int answer = m*2;
        return answer;
    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // 배열의 인덱스는 0부터 시작
        int size = num2 - num1 + 1;
        int[] answer = new int[size];
        
        
        int idx = 0;
        for(int i = num1; i <= num2 ; i++){
            answer[idx++] = numbers[i];
        }
        
        return answer;
    }
}
