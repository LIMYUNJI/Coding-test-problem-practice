package Testsolution;

public class sequence {

	private int soultion(int[] common) {
		int result = 0;
		int len = common.length;
		// 등차 수열인지
		if (common[len - 1] - common[len - 2] == common[len - 2] - common[len - 3]) {
			result = common[len - 1] + common[len - 1] - common[len - 2];
		} else {
			result = common[len - 1] * common[len - 1] / common[len - 2];

		}

		return result;
	}

	public static void main(String[] args) {
		sequence seq = new sequence();
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 4, 8 };
		
		System.out.println(seq.soultion(arr1));
		System.out.println(seq.soultion(arr2));

	}

}
