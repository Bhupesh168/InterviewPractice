package com.practice;

public class Prefix {

	public static void main(String[] args) {
		String a = longestCommonPrefix(new String[] { "aaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
		System.out.println(a);
	}

	public static String longestCommonPrefix(String[] A) {
		String d = "";
		String c = "";

		if (A.length > 1) {
			char[] b = A[0].toCharArray();
			char[] b1 = A[1].toCharArray();

			for (int j = 0; j < (b.length > b1.length ? b1.length : b.length); j++) {

				if (b[j] == b1[j]) {

					d += b[j];
				}
			}
			if (A.length > 2) {
				for (int i = 2; i <= A.length - 1; i++) {
					char[] b2 = A[i].toCharArray();
					char[] b3 = d.toCharArray();
					for (int k = 0; k < (d.length() < b2.length ? d.length() : b2.length); k++) {

						if (b2[k] == b3[k]) {

							c += b2[k];

						} else
							break;

					}
					d = c;
					c = "";

				}
			}
		} else
			d = A[0];
		return d;
	}
}