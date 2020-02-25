public class SinglyLinkedList {
	
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
		SinglyNode node10 = new SinglyNode(10,null);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;	
		node8.next = node9;
		node9.next = node10;
		return root;
	}	
	
	public void PrintList(SinglyNode root) {
		if(root==null) {
			System.out.println("Empty Linked List");
		}
		SinglyNode temp = root;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public SinglyNode ReverseLinkedList(SinglyNode root) {
		if(root == null) {
			return null;
		}
		SinglyNode p = root;
		SinglyNode q = null;
		SinglyNode r = null;
		while(p.next != null) {
			q = p;
			p = p.next;
			q.next = r;
			r = q;			
		}
		p.next = q;
		return p;
		
	}

	public SinglyNode ReverseLinkedListInGroup(SinglyNode root, int groupSize) {
		if(root == null) {
			return null;
		}
		SinglyNode newRoot = null;
		int count=0;
		SinglyNode p = root;
		SinglyNode q = null;
		SinglyNode r = null;
		SinglyNode tail = root;
		SinglyNode realtail = null;
		int set = 0;
		while(p != null && p.next != null) {
			q = null;
			r = null;			
			while(count < groupSize && p != null) {	
				if(count == 0 ) {
					realtail = p;
				}				
				count++;				
				q = p;
				p = p.next;
				q.next = r;
				r = q;			
			}
			
				set++;
				if(set == 1) {
					newRoot = q;									
				}
				else if(set == 2) {
					tail = root;
					tail.next = q;
					tail=realtail;
				}
				else {
					tail.next = q;
					tail = realtail;
				}	
				count = 0;
				
		}		
		realtail.next = p;
		
		return newRoot;
		
	}

	public SinglyNode AddNodeInBeginning(SinglyNode root, int data) {
		SinglyNode node = new SinglyNode();
		node.data = data;
		node.next = root;
		return node;
	}
	
	public SinglyNode AddNodeAtLast(SinglyNode root, int data) {
		SinglyNode node = new SinglyNode();
		node.data = data;
		node.next = null;		
		if(root == null) {
			return node;
		}
		else {
			SinglyNode temp = root;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		return root;
	}

	public SinglyNode AddNodeBeforeANode(SinglyNode root, int data, int val) {
		SinglyNode node = new SinglyNode();
		SinglyNode previous = new SinglyNode();
		node.data = val;
		node.next = null;		
		if(root == null) {
			return node;
		}
		else {
			SinglyNode temp = root;
			while(temp.next!=null && temp.data!=data) {
				previous = temp;
				temp = temp.next;
			}
			if(temp.data == data) {
				if(temp == root) {
					node.next = temp;
					return node;
				}
				node.next = temp;
				previous.next=node;
			}
			else {
				return null;
			}			
		}
		return root;
	}

	public SinglyNode AddNodeAfterANode(SinglyNode root, int data, int val) {
		SinglyNode node = new SinglyNode();		
		node.data = val;
		node.next = null;		
		if(root == null) {
			return node;
		}
		else {
			SinglyNode temp = root;
			while(temp.next!=null && temp.data!=data) {				
				temp = temp.next;
			}
			if(temp.data == data) {
				node.next = temp.next;
				temp.next = node;
			}
			else {
				return null;
			}			
		}
		return root;
	}

	public SinglyNode DeleteKey(SinglyNode root, int data) {
		if(root == null) {
			return root;
		}
		SinglyNode previous = root;
		SinglyNode temp = root;
		while(temp.next != null && temp.data != data ) {
			previous = temp;
			temp = temp.next;
		}
		if(temp.data == data ) {
			if(temp == root) {
				root = temp.next;
				temp.next = null;
			}
			else {
				previous.next = temp.next;
			}
		}
		else {
			return null;
		}
		return root;
		
	}
	
	public SinglyNode DeleteAtGivenPosition(SinglyNode root, int position) {
		
		SinglyNode temp = root;
		int count = 1;
		SinglyNode previous = null;
		while(temp != null) {
			if(count == position) {
				if(temp == root) {
					root = temp.next;
					temp.next = null;
					return root;
				}
				temp.data = temp.next.data;
				previous = temp.next;
				temp.next = temp.next.next;
				previous.next = null;
			
			}
			temp = temp.next;
			count++;
		}
		return root;
	}


}

