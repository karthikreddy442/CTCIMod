
public class LLReverseIterative {


	public Node reverseIteratively(Node head){
		
		
		if(head==null || head.next ==null){
			return head;
		}
		
		Node second=head.next;
		Node third=second.next;
		
		
		second.next=head;
		head.next=null;
		if(third==null){
			return second;
			}
		
		Node currentNode=third;
		Node previousNode=second;
		
		
		while(currentNode!=null){
			Node nextNode=currentNode.next;
			currentNode.next=previousNode;
			
			
			previousNode=currentNode;
			currentNode=nextNode;
			
		}
		
		head=previousNode;
		return previousNode;
	}
	
}


class Node{

	Node next;
	int data;
	public Node(int data, Node next) {
		this.data=data;
		this.next=next;
	}
	
}