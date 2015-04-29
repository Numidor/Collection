/*
* Removes duplicate nodes from a lnked list
*/
package uniquelinkedlist;

public class UniqueLinkedList {

    public static void main(String[] args) {
        Node<Integer> Link4 = new Node(3, null);
        Node<Integer> Link3 = new Node(2, Link4);
        Node<Integer> Link2 = new Node(2, Link3);
        Node<Integer> Link1 = new Node(1, Link2);
        List<Integer> list = new List(Link1);

        Node next = list.head;
        while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }
        System.out.println("Cleaned up linked list:");
        list.head = removeDuplicate(list.head);
        next = list.head;
        while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }
    }

    public static Node removeDuplicate(Node headNode) {
        Node prev = headNode;
        Node tmp = headNode;
        Node check = headNode;
        int dup = 0;
        while (tmp != null) {
            for (check = headNode; check != tmp; check = check.next) {
                if (check.data == tmp.data) {
                    dup = 1;
                    break;
                }
            }
            if (dup == 0) {
                prev = tmp;
                tmp = tmp.next;
            } else {
                prev.next = tmp.next;
                //delete(tmp);
                tmp = prev.next;
                dup = 0;
            }
        }
        return headNode;
    }

}

class List<T> {

    Node<T> head;

    public List(Node<T> node) {
        this.head = node;
    }
}

class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
