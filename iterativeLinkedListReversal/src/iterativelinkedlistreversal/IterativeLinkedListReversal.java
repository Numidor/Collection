
package iterativelinkedlistreversal;

public class IterativeLinkedListReversal {

    public static void main(String[] args) {
        Node<Integer> Link3 = new Node(3, null);
        Node<Integer> Link2 = new Node(2, Link3);
        Node<Integer> Link1 = new Node(1, Link2);
        List<Integer> list = new List( Link1 );
        
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
    
    public static Node reverseList( Node headNode ){
        if(headNode == null){
            return headNode;
        }
        Node prev = null;
        Node curr = headNode;
        while( curr != null ){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        headNode = prev;
        return headNode;
    }
    
}

class List<T> {
    Node<T> head;
    public List( Node<T> node) {
        this.head = node;
    }
}

class Node<T>{
   public T data;
   public Node<T> next;
   public Node(T data, Node<T> next){
      this.data = data;
      this.next = next;
   }
}
