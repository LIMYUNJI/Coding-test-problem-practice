package BinaryTree;

//public class binarytreeTest {
//	// 같은 번호가 될때까지
//	static class Solution{
//		public int solution(int n, int a, int b) {
//			int result;
//			
//			for(result = 0; a!=b; result++) {
//				// 이진트리
//				a = (a + 1)/2;
//				b = (b + 1)/2;
//			}
//			return result; 
//		}
//	}
//	public static void main(String[] args) {
//		Solution sol = new Solution();
//		System.out.println(sol.solution(8, 4, 7));
//	}
//
//}

//// 방법2
//public class binarytreeTest {
//	// 같은 번호가 될때까지
//	class Solution{
//		public int solution(int n, int a, int b) {
//			int result = 0;
//			int count = 0;
//			int s = n;
//			
//			for(int i = 0; i<=n; i++) {
//				if( s == 1) {
//					break;
//				}
//				s= s/2;
//				count++;
//			}
//			
//			for(int i = count; i<=count; i--) {
//				n = n/2;
//				if(n <b && n >=a || b<n && n<a) {
//					result =i;
//					break;
//				}else {
//					b = b - n;
//					a = a - n;
//				}
//			}
//			return result; 
//		}
//	}
//
//}

//public class binarytreeTest {
//	// 같은 번호가 될때까지
//	static class Solution{
//		public int solution(int n, int a, int b) {
//			int result = 0;;
//			
//			while(a!=b) {
//				// 이진트리
//				a = (a /2)+(a % 2);
//				b = (b /2)+(b % 2);
//				result++;
//			}
//			return result; 
//		}
//	}
//
//}

public class binarytreeTest {
	public static void main(String[] args) {
		System.out.println(solution(8,4,7));	
}
	public static int solution(int n, int a, int b) {
		int result = 0;
		
		while(true) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			result++;
			if(a == b) {
				break;
			}
			
		}
		return result;

	}
}
