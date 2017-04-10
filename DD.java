
public class DD<T> implements Deque<T> {
	
	
	
    //Instantiates the front and end nodes, as well as the size variable
    private DLLNode<T> front, end;
    private int size;
 
    //Default constructor, instantiates the front and end nodes to = null
    public DD() {
	front = end = null;
    }
    
    //addFirst( T val ), adds the node in the front
    public void addFirst( T val ) {
	DLLNode<T> subIn = new DLLNode( val, null, null ); //instantiates temporary node for val
	if ( size == 0 ) { //checks in case the node is empty
	    front = subIn; 
	    end = subIn;
	    //makes val both the front and end of the value
	}
	else {
	    front.setPrev( subIn ); //adds subIn to the nodes, connecting them, subIn being in the front
	    subIn.setNext( front ); //sets the former front as the next value for subIn
	    front = subIn; //sets front the new val
	}
	size++; //increases the size
    }

    //addLast ( T val ), adds the node at the end 
    public void addLast( T val ) {
	DLLNode<T> subIn = new DLLNode( val, null, null );
	if ( size == 0 ) { //checks in case the node is empty
	    front = subIn;
	    end = subIn;
            //makes val both the front and end of the value
	}
	else {
	    end.setNext( subIn ); //adds subIn to the nodes, connecting them, subIn being in the front
	    subIn.setPrev( end ); //sets the former front as the next value for subIn
	    end = subIn; //sets front the new val
	}
	size++; //increases the size
    }

    //toString(), returns String version of the nodes
    public String toString() {
	String retStr = ""; 
	DLLNode<T> dummyNode = front; //instantiates dummyNode so front isn't affected
	while ( dummyNode != null ){ //loop ends once it reaches a null value
	    retStr += dummyNode.getCargo(); 
	    retStr += " --> ";
	    dummyNode = dummyNode.getNext(); //sets dummy the next value, hence why we instantiated a dummy node,
	    //to prevent front from getting changed to front = end
	}
	return retStr; //returns retStr
    }

    //contains( Object O ), checks if it contains a node with the object specified in the params
    public boolean contains( Object O ) {
	DLLNode dummyFront = front; //instantiates a dummyNode
	while ( dummyFront != null ) { //while loop that goes through the nodes
	    if ( dummyFront.getCargo().equals( O ) ) { //checks if the node equals to object O
		return true; 
	    }
	    dummyFront = dummyFront.getNext(); //goes to the next node
	}
	return false; 
    }

    //getFirst(), returns the node at front
    public T getFirst() {
	return front.getCargo();
    }

    //getLast(), returns the node at the end
    public T getLast() {
	return end.getCargo();
    }

    //removeFirst(), removes the node at the front
    public T removeFirst() {
	try {
	
	
	    T retT = this.getFirst(); //instantiates return value
	    front = front.getNext(); //sets the front to the node after the front node that's going to be removed
	    front.setPrev( null ); //sets the prev node to null for front, removing the former front node
	    return retT;
	}
	catch (Exception e){
	    System.out.println("--you can't remove something that doesn't exist in removeFirst--");
	    return null; //comment this line out if you want the exception thrown instead of returning an empty string;
	    //throw e;   //uncomment this line if you want the exception thrown
	}
    }

    //removeLast(), 
    public T removeLast() {
	try {
	    T retT = this.getLast(); //instantiates return value
	    end = end.getPrev(); //sets the end to the node before the front node that's going to be removed
	    end.setNext( null ); //sets the next node to null for end, removing the former end node
	    return retT;
	}
	catch(Exception e) {
	    System.out.println("--you can't remove something that doesn't exist in removeLast ---");
	    return null; //comment this line out if you want the exception thrown instead of returning an empty string;
	    //throw e;   //uncomment this line if you want the exception thrown
	}
    }
    
    //size(), returns size()
    public int size() {
	return size;
    }

    public static void main( String[] args ) {
	//checking if addFirst( T val ) works correctly
	DD bob = new DD(); //instantiates new DD();
	bob.addFirst("you"); 
	bob.addFirst("for");
	bob.addFirst("cake");
	bob.addFirst("no");
	System.out.println("bob:" + bob); 
	
	//checking if addLast( T val ) works correctly
	DD marley = new DD(); //instantiates new DD();
	marley.addLast("no");
	marley.addLast("cake");
	marley.addLast("for");
	marley.addLast("you");
	System.out.println("marley: " + marley); 

	//checking if contains(), get() methods, and remove() methods work correctly or not
	System.out.println("marley has cake?: " + marley.contains ("cake")); //returns true 
	System.out.println("marley has plants?: " + marley.contains ("plants")); //returns false
	System.out.println("last: " + marley.getFirst()); //returns "you"
	System.out.println("front: " + marley.getLast()); //returns "no"
	System.out.println("removed first: " + marley.removeFirst()); //removes "no"
	System.out.println("removed last: " + marley.removeLast()); //removes "you"
	System.out.println(marley);
	    
	//checking if the exception statements work correctly
	System.out.println("removed last: " + marley.removeLast()); //removes "for"
	System.out.println("removed last: " + marley.removeLast()); //removes "cake"
	System.out.println("removed last: " + marley.removeLast()); //removes "cake"
    }
}
