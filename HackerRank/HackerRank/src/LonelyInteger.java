import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
	public static void main(String args[]) throws IOException {
		HashSet<Integer> hashset = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long res;
		int t = Integer.parseInt(br.readLine());
		String[] s = new String[t];
		s = br.readLine().trim().split(" ", -1);
		long sumInput = 0;
		int flag = 0;
		for (int i = 0; i < t; ++i) {
			hashset.add(Integer.parseInt(s[i]));
			sumInput += Integer.parseInt(s[i]);
			if (Integer.parseInt(s[i]) == 0)
				flag = 1;
		}

		Iterator<Integer> h = hashset.iterator();
		long sumUnique = 0;
		while (h.hasNext()) {
			sumUnique += 2 * h.next();
		}
		res = sumUnique - sumInput;
		if (res == 0 && flag == 1)
			System.out.println(0);
		else
			System.out.println(res);
	}
}