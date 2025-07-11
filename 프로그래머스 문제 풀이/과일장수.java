// 사과의 최대 점수 K 최하점은 1
// 한 상자에 들어가는 사과의 수 m
// 사과들의 점수 score
// (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8
// 상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m
// 과일 장수가 얻을 수 있는 최대 이익을 구하시오
// * 사과는 상자 단위로만 판매하며 남는 사과는 버림

// 그리디 알고리즘
// 유망하수: 박스를 포장해 팔 때, 가장 점수가 낮은 사과 기준으로 박스를 만
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

            for(int i = 0; i < score.length; i++){
            score[i] = 
        }
        return answer;
    }
}
