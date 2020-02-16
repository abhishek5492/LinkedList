
public class LinkedList {
	
	public static void main(String [] args) {		
		
		
		SinglyLinkedList sll = new SinglyLinkedList();
		SinglyNode root = sll.CreateList();
		sll.PrintList(root);		
		SinglyNode newroot = sll.AddNodeAfterANode(root, 0, 22);	
		sll.PrintList(newroot);
	}

}