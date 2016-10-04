package ua.com.mi.epam.etlec_1;

public class Etlec_1_9 {
	public static void main(String[] args) {
		int ab[][][][][][] = new int[2][2][2][2][2][2];
		int a, b, c, d, e, f, k = 1;
		for (a = 0; a < ab.length; a++) {
			for (b = 0; b < ab.length; b++) {
				for (c = 0; c < ab.length; c++) {
					for (d = 0; d < ab.length; d++) {
						for (e = 0; e < ab.length; e++) {
							for (f = 0; f < ab.length; f++) {
								ab[a][b][c][d][e][f] = k++;
								System.out.print(ab[a][b][c][d][e][f] + "\t");
							}
						}
					}
					System.out.println();
				}
			}
		}
	}
}
