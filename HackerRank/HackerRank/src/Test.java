public class Test {
	static int[] A = new int[3];

	public static void main(String[] args) {
		Binary(3);
	}

	public static void Binary(int n) {
		if (n < 1) {
			for (int i = 0; i < 3; ++i)
				System.out.print(A[i] + ", ");
			System.out.println();
		} else {
			A[n - 1] = 0;
			Binary(n - 1);
			A[n - 1] = 1;
			Binary(n - 1);
		}
	}
}