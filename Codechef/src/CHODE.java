import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CHODE {
	static class Stringchars implements Comparable<Stringchars> {
		char s;
		int freq;
		int pos;

		public Stringchars(char s, int freq, int pos) {
			char b = s;
			if (b >= 65 && b <= 90)
				b += 32;
			this.s = b;
			this.freq = freq;
			this.pos = pos;
		}

		@Override
		public int compareTo(Stringchars r) {
			int z = (this.freq - r.freq);
			if (z == 0)
				return this.s - r.s;
			return z;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		char freq[] = new char[26];
		int freqtext[] = new int[26];
		String s;

		String n3;
		int i;
		int count;
		int counter;
		char s1;
		int m;
		char oldChar;
		char newChar;
		Stringchars[] stringchars;

		while (t-- > 0) {
			Arrays.fill(freqtext, 0);

			s = br.readLine().trim();
			for (i = 0; i < 26; ++i)
				freq[i] = s.charAt(25 - i);

			s = br.readLine().trim();
			int l = s.length();
			count = 0;
			char[] text = new char[l];
			for (i = 0; i < l; ++i) {
				s1 = s.charAt(i);
				text[i] = s1;
				if (s1 >= 65 && s1 <= 90) {
					freqtext[s1 - 65]++;
					count++;
				} else if (s1 >= 97 && s1 <= 122) {
					freqtext[s1 - 97]++;
					count++;
				}
			}

			stringchars = new Stringchars[count];
			counter = 0;

			for (i = 0; i < l; ++i) {
				s1 = s.charAt(i);
				if (s1 >= 65 && s1 <= 90 || s1 >= 97 && s1 <= 122) {
					int frequ;
					if (s1 >= 65 && s1 <= 90)
						frequ = freqtext[s1 - 65];
					else
						frequ = freqtext[s1 - 97];

					stringchars[counter] = new Stringchars(s1, frequ, i);
					counter++;
				}
			}

			Arrays.sort(stringchars);

			m = 0;
			while (count != 0) {
				int freque = stringchars[count - 1].freq;

				while (freque != 0) {
					oldChar = text[stringchars[count - 1].pos];
					newChar = freq[m];
					if (oldChar >= 65 && oldChar <= 90)
						newChar = (char) (newChar - 32);
					text[stringchars[count - 1].pos] = newChar;
					count--;
					freque--;
				}
				m++;
			}

			System.out.println(new String(text));
		}
	}
}