package algorithm;

public class StarShootinHourglass {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 7; i++) {
			if (i > 4)
				for (int k = i; k < 3; k++)
					System.out.print(" ");
			else
				for (int k = 0; k < i - 1; k++)
					System.out.print(" ");
			if (i > 4)
				for (int j = 0; j <= i * 2; j++)
					System.out.print("*");
			else
				for (int j = i * 2; j < 13; j++)
					System.out.print("*");

			System.out.println("");
		}
	}

}
