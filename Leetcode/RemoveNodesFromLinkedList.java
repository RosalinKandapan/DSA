package leetcode;

import leetcode.Reverse_LinkedListIteratively.Node;

public class RemoveNodesFromLinkedList {
	
	public static Node removeNodes(Node head) {
		if (head == null) {
            return null;
        }
        
        head = reverse(head);
        Node current = head;
        Node maxNode = head;
        
        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxNode = current;
            }
        }
        
        
        return reverse(head);
    }
    
    
    private static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    

    //Recursive approch
    /* if(head==null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.data < head.next.data ? head.next : head;*/
		 
	
	
	
	public static void main(String[] args) {
		Node n= new Node(5);
		Node head=n;
		head.next =new Node(2);
		head.next.next =new Node(13);
		head.next.next.next =new Node(3);
		head.next.next.next.next =new Node(8);
		Node right = removeNodes(head);
		System.out.println(right.data);
	}

}
