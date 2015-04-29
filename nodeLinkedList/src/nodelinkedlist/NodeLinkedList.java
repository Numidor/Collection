/*
* Return the node N nodes away from the end of the linked list
*/
package nodelinkedlist;

public class NodeLinkedList {

    public static void main(String[] args) {
        Node<Integer> Link4 = new Node(3, null);
        Node<Integer> Link3 = new Node(2, Link4);
        Node<Integer> Link2 = new Node(2, Link3);
        Node<Integer> Link1 = new Node(1, Link2);
        List<Integer> list = new List(Link1);

        Node next = list.head;
        /*while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }*/
        returnNode(list.head, 3);
        /*list.head = returnNode(list.head, 3);
        next = list.head;
        while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }*/
    }

    public static Node returnNode(Node headNode, int n) {
        if (headNode == null) {
            System.out.println("Starting node is null");
            return headNode;
        }
        Node ref = headNode;
        Node main = headNode;
        int count = 0;
        while (count < n) {
            if (ref == null) {
                System.out.println(n + " is longer the length of the given list");
                break;
            }
            ref = ref.next;
            count++;
        }
        while (ref != null) {
            main = main.next;
            ref = ref.next;
        }
        System.out.println("The node " + n + " nodes from the end of the list is " + main.data);
        return main;
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
