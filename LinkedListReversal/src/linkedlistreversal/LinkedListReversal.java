/*
* Recursive Linked List reversal
*/
package linkedlistreversal;

public class LinkedListReversal {

    public static void main(String[] args) {

        Node Link3 = new Node(3, null);
        Node Link2 = new Node(2, Link3);
        Node Link1 = new Node(1, Link2);
        List list = new List( Link1 );
        
        Node next = list.head;
        while ( next != null ) {
            System.out.println( next.data );
            next = next.next;
        }
        list.head = reverseList( list.head );
        next = list.head;
        while ( next != null ) {
            System.out.println( next.data );
            next = next.next;
        }
    }

    public static Node reverseList( Node currentNode ){
        return reverseHelper(currentNode, null);
    }
    
    private static Node reverseHelper(Node currentNode, Node previousNode){
        Node tmp = null;
        if (currentNode !=  null){
            tmp = currentNode.next;
            currentNode.next = previousNode;
        }
        if(tmp != null ){
            return reverseHelper(tmp, currentNode);
        }
        return currentNode;
    }
}

class List {
    Node head;
    public List( Node node) {
        this.head = node;
    }
}

class Node{
   public int data;
   public Node next;
   public Node(int data, Node next){
      this.data = data;
      this.next = next;
   }
}