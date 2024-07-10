package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T t) {
        DNode<T> newNode = new DNode<>(t, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.setNext(head);
        head.setPrev(newNode);
        head = newNode;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        String s = "[";
        DNode<T> current = head;
        while (current != null) {
            s += current.getData();
            if (current.getNext() != null) {
                s += ", ";
            }
            current = current.getNext();
        }
        return s + "]";
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> l = new DoublyLinkedList();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        System.out.println(l);
        System.out.println(l.head);
        System.out.println(l.tail);
    }
}

class DNode<T> {
    private T data;
    private DNode<T> next;
    private DNode<T> prev;

    public DNode(T t, DNode<T> p, DNode<T> n) {
        data = t;
        prev = p;
        next = n;
    }

    public void setData(T t) {
        data = t;
    }

    public void setNext(DNode<T> n) {
        next = n;
    }

    public void setPrev(DNode<T> p) {
        prev = p;
    }

    public T getData() {
        return data;
    }

    public DNode<T> getNext() {
        return next;
    }

    public DNode<T> getPrev() {
        return prev;
    }
}