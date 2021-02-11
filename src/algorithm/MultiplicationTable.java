package algorithm;

public class MultiplicationTable {

	private static class Singleton {
		private static final MultiplicationTable instance = new MultiplicationTable();
	}

	public static MultiplicationTable getInstance() { return Singleton.instance; }

	public static void main(final String[] args) {

		// 처음 시작할 단이 몇단인지 입력
		MultiplicationTable.getInstance().multiple(2);

	}

	private MultiplicationTable() {}

	public void multiple(final Integer number) {

//		int	num1	= number;
		int	value	= 1;

		for (int i = 1; i <= 3; i++) {
			if (i != 1 && (i - 1) % 3 == 0) {
//				num1	= num1 + 2;
				value	= 1;
			}
			
			for(int j = 2; j <= 9; j++) {
				for (int k = value; k <= value + 2; k++) {
					System.out.printf("%3d", j * k);
				}
				System.out.print("   ");
				
			}

//			for (int j = value; j <= value + 2; j++)
//				System.out.printf("%3d", num1 * j);
//			System.out.print("    ");
//
//			for (int k = value; k <= value + 2; k++)
//				System.out.printf("%3d", (num1 + 1) * k);
 
			value = value + 3;
			System.out.println("");

		}
	}

}
