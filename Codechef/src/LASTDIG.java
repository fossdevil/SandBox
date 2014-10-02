import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LASTDIG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		// int d[] = { 0, 1, 4, 3, 8, 5, 2, 7, 6, 9 };
		long cA;
		long cB;
		while (t-- > 0) {
			String s[] = br.readLine().split(" ", -1);
			long A = Long.parseLong(s[0]);
			long B = Long.parseLong(s[1]) + 1;
			long num1 = A / 10;
			long num2 = B / 10;
			cA = 45 * num1;
			cB = 45 * num2;
			for (long num = num1 * 10; num < A; num++) {
				cA = cA + countD(num);
			}
			for (long num = num2 * 10; num < B; num++) {
				cB = cB + countD(num);
			}
			System.out.println(cB - cA);
		}
	}

	public static long countD(long num) {
		long ret = 0;
		while (num != 0) {
			if ((num % 10) % 2 == 0)
				ret += ((num % 10) * 2) % 10;
			else
				ret += (num % 10);
			num /= 10;
		}
		return ret % 10;
	}
}
