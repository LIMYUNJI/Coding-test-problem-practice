public class Main {
	public static void main(String[] argr) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();

		String[] Asub = A.split(" ");

		long[] numA = new long[Asub.length];

		long sum = 0;
		for (int i = 0; i < Asub.length; i++) {
			numA[i] = Long.parseLong(Asub[i]);
			sum += numA[i];
		}
		System.out.println(sum);
	}

}