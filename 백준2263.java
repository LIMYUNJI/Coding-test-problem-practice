public class Main{
  static int n;
  static int[] inorder, postorder, indx;

  public static void min(String[] args) throws IOException {
    BufferedReder br = new BufferedReader(new InputStreamReder(System.in));
    StringBuilder sb = new StringBuilder();

    n = Integer.parseInt(br.readLine());
    inorder = new int[n];
    postorder = new int[n];
    index = new int[n + 1];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      postorder[i] = Integer.parseInt(st.nextToken());
    }
     preorder(0, n - 1, 0, n - 1, sb);

    System.out.printin(sb);
  }
static void preorder(int inStart, int inEnd, int postStart, int postEnd, StringBuilder sb) {
        if (inStart > inEnd || postStart > postEnd) return;

        int root = postorder[postEnd];
        sb.append(root).append(" ");

        int rootIndex = idx[root];
        int leftSize = rootIndex - inStart;

  
        preorder(inStart, rootIndex - 1, postStart, postStart + leftSize - 1, sb);
        preorder(rootIndex + 1, inEnd, postStart + leftSize, postEnd - 1, sb);
    }
  
}
