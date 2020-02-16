
public class CircularLinkedList {
	
	public SinglyNode CreateList() {
		SinglyNode root = new SinglyNode(0, null);
		SinglyNode node1 = new SinglyNode(1, null);
		SinglyNode node2 = new SinglyNode(2, null);
		SinglyNode node3 = new SinglyNode(3, null);
		SinglyNode node4 = new SinglyNode(4, null);
		SinglyNode node5 = new SinglyNode(5, null);
		SinglyNode node6 = new SinglyNode(6, null);
		SinglyNode node7 = new SinglyNode(7, null);
		SinglyNode node8 = new SinglyNode(8, null);
		SinglyNode node9 = new SinglyNode(9, null);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;	
		node8.next = node9;
		node9.next = root;
		return root;
	}
	
	public void PrintList(SinglyNode root) {
		if(root==null) {
			System.out.println("Empty Linked List");
		}
		SinglyNode temp = root;
		while(temp.next!=root) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
		
}
	
	


