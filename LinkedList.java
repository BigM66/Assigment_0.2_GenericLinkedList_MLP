

/**
 * a class that creates a generic linked list 
 * @author Matthew Parsley
 *
 */


public class LinkedList<T> extends Node<T> {
	/*
	 * creates the head of the Node
	 */
	Node head;
	/*
	 * creates an integer to hold the length of the node 
	 */
	int length;
	/*
	 * creates the tail of the node 
	 */
	Node tail;
	
	/*
	 * sets up our linkedlist
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	
	/*
	 * determines if the linked list is empty
	 * @returns true if it is false if not 
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/*
	 * tells us the value of the first item in our linked list 
	 * @returns the value of the first node in the linked list 
	 */
	public Node getList()
	{
		return head;
	}
	
	/*
	 * adds another node to the end of the linked list 
	 * @param aNode- the node we are adding 
	 */
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList=new LinkedList();
		
		Node<String> aNode=new Node();
		aNode.setData("Matthew");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Parsley");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}

}