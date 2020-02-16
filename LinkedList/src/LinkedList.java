
public class LinkedList {
	
	public static void main(String [] args) {		
		
		
		SinglyLinkedList sll = new SinglyLinkedList();
		SinglyNode root = sll.CreateList();
		sll.PrintList(root);		
		SinglyNode newroot = sll.DeleteKey(root, 10);	
		sll.PrintList(newroot);
	}

}