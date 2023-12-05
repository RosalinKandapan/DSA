package leetcode;

import leetcode.Reverse_LinkedListIteratively.Node;

public class RemoveNodesFromLinkedList {
	
	public static Node remove(Node head) {
//		Node left = head;
//		Node right = head.next;
//		while(right.next!=null) {
//		if(left.data<right.data) {
//			left=right;
//			right=left.next;
//
//		} else
//		{
//			right=right.next;
//		}
//	}
//		return left;
		
		Node curr=head;
		int max=head.data;
		Node prev =head;
		 head= head.next;
		 while(head.next!=null) {
			 if(max<=head.data) {
				 max=head.data;
				 prev=head;
				 head=head.next;
			 } else {
				 prev.next=head.next;
				 head=prev.next;
			 }
		 }
		 return prev;
		} 
	
	
	
	public static void main(String[] args) {
		Node n= new Node(5);
		Node head=n;
		head.next =new Node(2);
		head.next.next =new Node(13);
		head.next.next.next =new Node(3);
		head.next.next.next.next =new Node(8);
Node right=		remove(head);
		System.out.println(right.data);
	}

}
