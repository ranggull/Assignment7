
public class AlphaList {

	private Node first;
	private Node last;
	private int size;

	private class Node {

		public String item;
		public Node next;
	}

	public AlphaList() {
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean empty() {
		return size == 0;
	}
	

	public String dequeue() {
		if (empty()) {
			throw new RuntimeException("Queue underflow");
		} else if (first == last) {
			String f = first.item;
			first = null;
			last = null;
			return f;
		}

		String f = first.item;
		first = first.next;
		size -= 1;
		return f;
	}

	public void enqueue(String item) {
		if (size >= 10) {
		throw new RuntimeException("List is greater than 10.");
		}
		Node x = new Node();
		x.item = item;
		if (first == null && last == null) {
			first = x;
			last = x;
			size += 1;
			return;
		}
		last.next = x;
		last = x;
		size += 1;
	}
}
