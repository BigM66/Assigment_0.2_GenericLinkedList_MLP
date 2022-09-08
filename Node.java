/**
 * the class for creating the node 
 * @author Matthew Parsley
 *
 */


class Node <T> {
	/*
	 * creates a generic item called data 
	 */
	T data;
	
	/*
	 * sets up a node to be useable as a the next node in a list
	 */
	Node<T> nextNode;
	
	/*
	 * creates our node item
	 */
	public Node()
	{
		nextNode=null;
	}
	
	/*
	 * sets our data to be the type we want it to be
	 * @param the type of data of our choosing 
	 */
	public void setData(T data) {
		this.data=data;
	}
	
	/*
	 * gets the value assigned to the node 
	 * @returns the value of the node 
	 */
	public Node<T> getNode() {
		return this;
	}
	
	/*
	 * makes it to where we can add another node to our list 
	 * @param the name of the next node we create 
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
} 
/*
 * end of class
 */
