package algorithm;

public class TestClass {

	private static class Singleton {
		private static final TestClass instance = new TestClass();
	}

	public static TestClass getInstance() { return Singleton.instance; }

	public static void main(final String args[]) {
		TestClass.getInstance().q1(7);
		TestClass.getInstance().q2(7);
		TestClass.getInstance().q3(7);
		TestClass.getInstance().q4(7);
	}

	private TestClass() {}

	public void q1(final Integer n) {
		System.out.println("----- q1 -----");
		for (Integer i = 0; i < n * 2 - 1; i++) {
			for (Integer j = 0; j <= (i < n ? i : n * 2 - i - 2); j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("---------------");
	}

	public void q2(final Integer n) {
		System.out.println("----- q2 -----");
		for (Integer i = 0; i < n * 2 - 1; i++) {
			for (Integer j = 0; j <= (i < n ? n - i - 1 : i - n + 1); j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("---------------");
	}

	public void q3(final Integer n) {
		System.out.println("----- 다이아 -----");
		for (Integer i = 0; i < n; i++) {
			for (Integer j = 0; j < n; j++)
				System.out.print((i < n / 2 ? j >= n / 2 - i && j <= n / 2 + i : j >= i - (n - 1) / 2 && j <= n - i + n / 2 - 1) ? "*" : " ");
			System.out.println();
		}
		System.out.println("---------------");
	}

	public void q4(final Integer n) {
		System.out.println("----- 모래시계 -----");
		for (Integer i = 0; i < n; i++) {
			for (Integer j = 0; j < n; j++)
				System.out.print((i < n / 2 ? j >= i && j <= n - i - 1 : j >= n - i - 1 && j <= i) ? "*" : " ");
			System.out.println();
		}
		System.out.println("---------------");
	}

}
