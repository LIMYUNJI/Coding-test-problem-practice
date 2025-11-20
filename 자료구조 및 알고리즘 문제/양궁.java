// 백트래킹 + 조합
// 유망함수 : 
// 라이언이 가장 큰 점수 차이로 우승하기 위해 n 발의 화살을 어떤 과녁들에 맞춰야 하는지
// 순서대로 정수 배열에 담아 retun, 우승 할 수 없는 경우(지거나, 비기는 경우 포함) -1 return
class Solution {
  int[] rayn = new int[11];
  int[] apeach = new int[11];
  int maxScore = 0; // 라이언이 어피치 보다 얻을 점수의 max값
  
  // 조합을 통해서 각각의 점수를 계산하는 코드
  private static int getScore(int[] ryan){
    int score = 0;
    for(int i = 0; i <=10; i++){
      if(rayn[i[ + apeach[1] > 0){
        // 삼항연산자
      }
      
    }
    return score;
  }
}
