package algorithm;

public class FindKnight {

	private int				first;
	private int				last;
	private int				maxSize;
	private Object[]	queueArray;

	public FindKnight(final int maxSize) {
		first					= 0;
		last					= -1;
		this.maxSize	= maxSize;
		queueArray		= queueArray;
	}

	public boolean empty() {
		return first == last + 1;
	}

	public boolean full() {
		return first == maxSize;
	}

	public void insert(final Object item) {

		queueArray[++last] = item;
	}

	public Object peek() {

		return queueArray[first];
	}

	public Object remove() {

		Object item = peek();
		first++;
		return item;
	}

}
