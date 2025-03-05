package Testsolution;

import java.util.Arrays;

public class TestArray {
	// 정수 배열을 정렬해서 반환하는 Solution() 함수를 완성하세요
	
	public static void main(String[] args) { // 원본 배열을 수정한 경우
		int[] org = {4, 2, 3, 1, 5};
		int[] sorted = solution(org);
		System.out.println(Arrays.toString(org));
		System.out.println(Arrays.toString(sorted));
		
	}
	
	private static int[] solution(int[] arr) {// 원본 배열을 유지하면서 원본 배열로부터 새오운 배열을 복사해서 사용
		int[] clone = arr;
		Arrays.sort(clone);
		return clone;
	}
}
