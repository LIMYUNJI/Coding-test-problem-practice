// substring 함수 : 문자열의 일부를 추출해 새로운 문자열을 반환하는 프로그래밍 언어의 기본 메서드
//                  시작과 끝 인덱스를 길이를 지정해 문자열을 추출 Ex) 문자열.substring(0, 7);

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = (my_string.substring(0, s) + overwrite_string 
                         + my_string.substring(s + overwrite_string.length()));
        return answer;
    }
}
