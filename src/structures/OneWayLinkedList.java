package structures;

import models.Student;

public class OneWayLinkedList {
    private Node head;
    private Node tail;

    public void add(Student student) {
        Node node = new Node(student);
        
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        
        tail.setNext(node);
        tail = node;
    }

}
