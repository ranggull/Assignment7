
public class AlphaList {

	private Node first = null;
	private Node last = null;

	private class Node {

		public String item;
		public Node next;
	}

	public boolean empty() {
		return first == null;
	}
	
	public boolean greaterThanTen() {
		Node selected = first;
		int count = 1;
		while(selected != last) {
			selected = first.next;
			count += 1;
		}
		return count > 10;
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
		return f;
	}

	public void enqueue(String item) {
		if (greaterThanTen()) {
		throw new RuntimeException("List is greater than 10.");
		}
		Node x = new Node();
		x.item = item;
		if (first == null && last == null) {
			first = x;
			last = x;
			return;
		}
		last.next = x;
		last = x;
	}
}
