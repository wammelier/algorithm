package algorithm;

public class MultiplicationTable {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		System.out.println("구구단을 외우자~");

		for (int i = 2; i < 3; i++)
			for (int j = 1; j < 10; j++)
				System.out.print(i + "x" + j + "=" + i * j);
		// System.out.println("");

	}

}
