
public class Queue {

	public static void main(String[] args) {

		AlphaList alpha = new AlphaList();
		alpha.enqueue("A");
		alpha.enqueue("B");
		alpha.enqueue("C");
		alpha.enqueue("D");
		alpha.enqueue("E");
		alpha.enqueue("F");
		alpha.enqueue("G");
		alpha.enqueue("H");
		alpha.enqueue("I");
		alpha.enqueue("J");
		alpha.enqueue("K");

		

		System.out.println(alpha.dequeue());

	}
}
