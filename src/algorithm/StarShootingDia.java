package algorithm;

public class StarShootingDia {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 14; i++) {
			if (i < 7)
				for (int j = i; j < 7; j++)
					System.out.print("*");
			else
				for (int j = 6; j < i + 1; j++)
					System.out.print("*");
			System.out.println("");
		}
	}

}
