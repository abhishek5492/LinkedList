
public class DoublyLinkedList{
	
	public DoublyNode CreateList() {
		DoublyNode root = new DoublyNode(0, null, null);
		DoublyNode node1 = new DoublyNode(1, null, root);
		DoublyNode node2 = new DoublyNode(2, null, node1);
		DoublyNode node3 = new DoublyNode(3, null, node2);
		DoublyNode node4 = new DoublyNode(4, null, node3);
		DoublyNode node5 = new DoublyNode(5, null, node4);
		DoublyNode node6 = new DoublyNode(6, null, node5);
		DoublyNode node7 = new DoublyNode(7, null, node6);
		DoublyNode node8 = new DoublyNode(8, null, node7);
		DoublyNode node9 = new DoublyNode(9, null, node8);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		return root;
	}
	
	public void PrintList(DoublyNode root) {
		if(root==null) {
			System.out.println("Empty Linked List");
		}
		DoublyNode temp = root;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

}
