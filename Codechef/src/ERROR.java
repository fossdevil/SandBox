import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ERROR {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int i;
		boolean ans;
		while (t-- > 0) {
			String s = br.readLine();
			ans = false;
			for (i = 0; i < s.length() - 2; i++) {
				if ((s.charAt(i) == 48 && s.charAt(i + 1) == 49 && s
						.charAt(i + 2) == 48)
						|| (s.charAt(i) == 49 && s.charAt(i + 1) == 48 && s
								.charAt(i + 2) == 49)) {
					ans = true;
					break;
				}
			}
			if (ans)
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
	}
}