import java.util.*;
public class Deque_array {
	
		public static void main(String[] args) {

			ArrayDeque deque = new ArrayDeque();

			for(int i = 1; i <= 10; i++) {
				deque.add(i);
			}
			deque.add(10);
			deque.addFirst(5);
			deque.addLast(15);
			deque.offer(20);
			deque.offerFirst(10);
			deque.offerLast(30);
			System.out.println("\ngetFirst() - " + deque.getFirst());
			
			System.out.println("\ngetLast() - " + deque.getLast());
			
			System.out.println("\npeek() - " + deque.peek());
			deque.remove();
			System.out.println("\nDeque after remove()\n" + deque);
			
			deque.removeFirst();
			System.out.println("\nDeque after removeFirst()\n" + deque);
			
			deque.removeLast();
			System.out.println("\nDeque after removeLast()\n" + deque);
			
			deque.remove(5);
			System.out.println("\nDeque after remove(5)\n" + deque);
}
}
