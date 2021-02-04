package algorithm;

public class StarShootingQ1 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 14; i++) {
			if (i < 7)
				for (int j = 0; j < i + 1; j++)
					System.out.print("*");
			else
				for (int j = i; j < 13; j++)
					System.out.print("*");
			System.out.println("");
		}
	}

}
