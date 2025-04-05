// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
// 제약 조건 n은 80억 이하인 자연수

// 이러한 유형의 문제는 입력받는 값이 크기 때문에 시간복잡도를 고려하여 문자열로 변환하여 풀 것
import java.util.Arrays;
import java.util.Collections;

class Solution {
  public long solution(long n){
    // 정수n을 문자열로 봔환하고 각자리 수로 잘라서 배열로 저장
    String[] str = new String.valueOf(n).split("");

    // 내림차순 정렬
    Arrays.sort(str, Collection.reverseOder());
    
    // 정렬된 순자를 다시 하나의 문자로 결합
    StringBuilder sb = new StringBuilder();
    for(String strs : str){
      sb.append(str);
    }

    return Long.parseLong(sb.toString());
  }
}
