public class Test {
	public static void main(String args[]) {
		String s = "abababacaabcbabcabacba";
		int m = s.length();
		int[] lps = new int[m];
		lps[0] = 0;
		int k = 0;
		for (int q = 1; q < m; ++q) {
			while (k > 0 && s.charAt(k) != s.charAt(q))
				k = lps[k - 1];
			if (s.charAt(k) == s.charAt(q))
				k++;
			lps[q] = k;
		}
		for (int i = 0; i < m; ++i) {
			System.out.print(lps[i]+" ");
		}
	}
}