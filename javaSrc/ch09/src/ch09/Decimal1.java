package ch09;

import java.text.DecimalFormat;

public class Decimal1 {
	public static void main(String[] args) {
		double number = 1234567.89;
		String[] pattern = {"0", "#", "0.0", "#.#", "0000000.00000", "#########.####",
				"#.#-", "-#.#", "#,####,##", "#,####.###", "#E0"};
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n", pattern[i],df.format(number));
		}
	}
}
