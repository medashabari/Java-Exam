import java.util.*;

public class Priority_queue {

	public static void main(String[] args) {

		PriorityQueue queue = new PriorityQueue();
		PriorityQueue anotherQueue = new PriorityQueue();
for(int i =1;i<=10;i++) {
	queue.add(i);
}
		
		System.out.println("\nQueue is " + queue);
		
		anotherQueue.addAll(queue);
		
		System.out.println("\nanotherQueue is " + anotherQueue);
		
		anotherQueue.offer(25);
		
		System.out.println("\nanotherQueue is " + anotherQueue);
		System.out.println("\nelement() - " + queue.element());
		System.out.println("\npeek() - " + queue.peek());
		queue.remove(8);		
		System.out.println("\nQueue after remove(8) is\n" + queue);
		queue.clear();		
		System.out.println("\nQueue after clear() is\n" + queue);
	
	}
	}

