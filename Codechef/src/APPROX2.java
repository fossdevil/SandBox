import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APPROX2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		int min = -1;
		int n, i, j, k, diff;
		int a[];
		int count = 0;
		String s[];
		while (t-- > 0) {
			s = br.readLine().trim().split(" ", -1);
			n = Integer.parseInt(s[0]);
			k = Integer.parseInt(s[1]);
			a = new int[n];
			s = br.readLine().trim().split(" ", -1);
			for (i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(s[i]);
			}
			min = Math.abs(a[1] + a[0] - k);
			count = 1;
			for (i = 0; i < n; ++i) {
				for (j = i + 1; j < n; ++j) {
					if (i == 0 && j == 1)
						continue;
					diff = Math.abs(a[i] + a[j] - k);
					if (diff < min) {
						count = 1;
						min = diff;
					} else if (diff == min)
						count++;
				}
			}
			System.out.println(min + " " + count);
		}
	}
}
