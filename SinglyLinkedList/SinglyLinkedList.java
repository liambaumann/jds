public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(T t) {
        if (this.head == null) {
            this.head = new Node<>(t, null);
            size++;
            return;
        }
        //if this.head exists already:
        this.head = new Node<>(t, this.head);
        size++;
    }

    public void addLast(T t) {
        if(this.head == null) {
            this.head = new Node<>(t,null);
            size++;
            return;
        }
        //if this.head exists already:
        Node<T> current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(t,null));
    }

    public String toString() {
        if (this.head == null) {
            return "[]";
        }
        String s = "[";
        Node<T> current = this.head;
        while (current != null) {
            s += current.getData();
            if (current.getNext() != null) {
                s += ", ";
            }
            current = current.getNext();
        }
        return s+"]";
    }
}

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}


