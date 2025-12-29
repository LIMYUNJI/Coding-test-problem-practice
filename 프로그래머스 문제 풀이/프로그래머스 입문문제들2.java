// 두 수의 곱 구하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
         answer = num1 * num2;
        }
        return answer;
    }
}

// 두 수의 합 구하기
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(-5000<=num1 && 50000>=num1 && -5000<=num2 && 50000>=num2){
         answer = num1 + num2;
        }
        
        return answer;
    }
}

// 각도기
class Solution {
    public int solution(int angle) {
        int answer = 0;

      // 에각일 때
        if(0 < angle && angle < 90){
            answer = 1;
       // 직각일 때
        } else if(angle == 90){
            answer = 2;
       // 둔각일 때   
        } else if(90 < angle && angle < 180){
            answer = 3;
        // 평각일 때
        } else if(angle == 180){
            answer = 4;
        } else {
          System.out.println("각도를 다시 입력 해주세요");
        }
        
        return answer;
    }
}
