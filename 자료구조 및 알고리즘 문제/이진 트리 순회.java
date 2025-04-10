package Stack;

class Solution {
	public static String[] solution(int[] nodes) {
		String[] result = new String[3];
		result[0] = preorder(nodes, 0).trim();
		result[1] = inorder(nodes, 0).trim();
		result[2] = postorder(nodes, 0).trim();

		return result;
	}

	// 전위순회 루트노드 -> 왼쪽 자식 -> 오른쪽 자식
	private static String preorder(int[] nodes, int idx) {
		if (idx >= nodes.length) {
			return ""; // index가 범위를 벗어나면 빈 문자열 반환
		}

		
		return "";
	}

	// 중위 순회 현재 노드를 부모 노드 -> 왼쪽 자식 -> 부모 노드 -> 오른쪽 자식
	private static String inorder(int[] nodes, int idx) {
		return "";
	}

	// 후위 순회 현재 노드를 부모 노드 -> 왼쪽 자식 -> 오른쪽 자식 -> 부모노드
	private static String postorder(int[] nodes, int idx) {
		return "";
	}

}
