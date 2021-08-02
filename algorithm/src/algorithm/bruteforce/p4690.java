package algorithm.bruteforce;

public class p4690 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				for (int k = j + 1; k <= 100; k++) {
					for (int l = k + 1; l <= 100; l++) {
						if (i * i * i == j * j * j + k * k * k + l * l * l) {
							System.out.println("Cube = " + i + ", Triple = (" + j + "," + k + "," + l + ")");
						}
					}
				}
			}
		}
	}
}