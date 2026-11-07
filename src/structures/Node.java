package structures;

class Node<T> {
    final T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
    
    void setNext(Node<T> node) {
        next = node;
    }
}
