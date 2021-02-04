package algorithm;

public class StarShootingQ2 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 14; i++) {
			for (int k = i; k < 3; k++)
				System.out.print(" ");
			for (int j = 0; j <= i * 2; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
