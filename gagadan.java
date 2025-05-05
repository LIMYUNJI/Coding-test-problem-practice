import java.util.*;

class gogodan{
  public static void main(String{} args){
    int sum = 0;

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sum = i * j;
				System.out.printf(" %d * %d = %2d", i, j, sum);
			}
			System.out.println();
		}
  }
}
