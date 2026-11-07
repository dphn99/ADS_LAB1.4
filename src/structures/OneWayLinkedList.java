package structures;

public class OneWayLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        
        size++;
    }
    
    public int size() {
        return size;
    }

}
