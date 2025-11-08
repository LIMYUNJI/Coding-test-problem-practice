package Stack;

class Solution {
    public static String[] solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim(); // 마지막 공백 제거
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();

        return result;
    }

    // 전위순회: 루트 -> 왼쪽 -> 오른쪽
    private static String preorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }
        return nodes[idx] + " " + preorder(nodes, 2 * idx + 1) + preorder(nodes, 2 * idx + 2);
    }

    // 중위순회: 왼쪽 -> 루트 -> 오른쪽
    private static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }
        return inorder(nodes, 2 * idx + 1) + nodes[idx] + " " + inorder(nodes, 2 * idx + 2);
    }

    // 후위순회: 왼쪽 -> 오른쪽 -> 루트
    private static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }
        return postorder(nodes, 2 * idx + 1) + postorder(nodes, 2 * idx + 2) + nodes[idx] + " ";
    }

    // 테스트
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};
        String[] result = solution(nodes);
        System.out.println("Preorder: " + result[0]);
        System.out.println("Inorder: " + result[1]);
        System.out.println("Postorder: " + result[2]);
    }
}
