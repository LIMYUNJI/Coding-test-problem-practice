import java.util.*;

public class ball{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();
	
	int[] arr = new int[n];
	for(int i =0; i < n ; i++){
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	
	int count =0;
	for(int i =0; i < n-1; i++){
		for(int j = j + 1;  j <n; j++){
			if(arr[i] != arr[j]){
				count += n - j;
				i++;
				j = i;
				continue;
}
		
		}
			}

		System.out.println(count);
}

}
