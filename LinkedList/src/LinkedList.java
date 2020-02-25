
public class LinkedList {
	
	public static void main(String [] args) {		
		
		
		SinglyLinkedList sll = new SinglyLinkedList();
		SinglyNode root = sll.CreateList();
		sll.PrintList(root);		
		SinglyNode newroot = sll.DeleteAtGivenPosition(root,7);	
		sll.PrintList(newroot);
	}

}