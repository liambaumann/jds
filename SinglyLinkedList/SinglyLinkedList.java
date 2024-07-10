public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T t) {
        if (head == null) {
            head = new Node<>(t, null);
            size++;
            return;
        }
        //if this.head exists already:
        head = new Node<>(t, head);
        size++;
    }

    public void addLast(T t) {
        if(head == null) {
            head = new Node<>(t,null);
            size++;
            return;
        }
        //if this.head exists already:
        Node<T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(t,null));
        size++;
    }

    public boolean delete(T t) {
        if(head == null) {
            return false;
        }

        //Check if head is to be deleted
        if(head.getData().equals(t)) {
            head = head.getNext();
            size--;
            return true;
        }

        //any other element to be deleted:
        Node<T> current = head;
        while(current.getNext() != null) {
            if(current.getNext().getData().equals(t)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
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

    public int getSize() {
        return this.size;
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


