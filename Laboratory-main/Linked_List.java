import java.util.*;
public class Linked_List{
	public static void main(String[] args){
		LinkedList  <Integer>  ls = new LinkedList <Integer>();
		for(int i=1;i<=10;i++){
				ls.add(i);
		}
		System.out.print("Linked List Elements :" +ls);
	
		

		ls.addFirst(11);
		ls.addLast(12);

		System.out.println();
		System.out.print("Modified Linked List Elements :  "+ls);
		

		ls.removeLast();
		ls.removeFirst();

		System.out.println();
		System.out.print("Modified Linked List Elements :  "+ls);
	

		System.out.println();

		System.out.println("First Element : "+ls.getFirst());
		System.out.println("Last Element : "+ls.getLast());
}
}