package algorithm;

import java.util.LinkedList;
import java.util.List;

public class Queue {

	private int						first;
	private int						last;
	private int						maxSize;
	private List<Object>	queueList	= new LinkedList<>();

	public Queue(final int maxSize) {
		first					= 0;
		last					= -1;
		this.maxSize	= maxSize;
		queueList			= new LinkedList<>();
	}

	public void addQueue(final Object item) {

	}

	public boolean empty() {
		return first == last + 1;
	}

	public boolean full() {
		return first == maxSize;
	}

	// public List peek() {
	// return first.data;
	// }
	//
	// public Object remove() {
	// Object item =
	// }

}
