/**
 * 
 */

/**
 * @author mpars
 *
 */


public class LinkedList<T> extends Node<T> {
	
	Node head;
	int length;
	Node tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public Node getList()
	{
		return head;
	}
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