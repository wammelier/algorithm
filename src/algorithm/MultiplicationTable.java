package algorithm;

public class MultiplicationTable {

	private static class Singleton {
		private static final MultiplicationTable instance = new MultiplicationTable();
	}

	public static MultiplicationTable getInstance() { return Singleton.instance; }

	public static void main(final String[] args) {

		// 처음 시작할 단이 몇단인지 입력
		MultiplicationTable.getInstance().multiple(3);

	}

	private MultiplicationTable() {}

	public void multiple(final Integer number) {

		int	start	= 2;
		int	value	= 1;
		int	cal		= 8 % number;
		if (8 % number != 0)
			cal++;

		for (int i = 1; i <= 3 * cal; i++, value += 3) {
			if (i != 1 && (i - 1) % 3 == 0) {
				// num1 = num1 + 2;
				value	= 1;
				start	= start + number;
			}

			for (int j = start; j < start + number && j != 9; j++) {
				for (int k = value; k <= value + 2; k++)
					System.out.printf("%3d", j * k);
				System.out.print("   ");
			} // end of outerFor

			System.out.println("");

		}
	}

}
