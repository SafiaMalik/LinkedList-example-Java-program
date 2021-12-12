import java.util.*;
public class linklistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java.util.LinkedList<String> linkedlist = new java.util.LinkedList<String>();
		linkedlist.add("ll1");
		linkedlist.add("ll2");
		linkedlist.add("ll3");
		linkedlist.add("ll4");
		linkedlist.add("ll5");
		System.out.println("Linked List items:"+linkedlist);
		
		linkedlist.addFirst("first item");
		linkedlist.addLast("last item");
		System.out.println("Linked List updated items:"+linkedlist);
		
		Object firstvar = linkedlist.get(0);
		System.out.println("Linked List first items:"+firstvar);
		linkedlist.set(0,"changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("Linked List after changed first items:"+firstvar2);
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("Linked List after removing items:"+linkedlist);
		
		linkedlist.add(0,"new added item");
		linkedlist.remove(1);
		System.out.println("Linked List final items:"+linkedlist);
		
		
		
	}

}
