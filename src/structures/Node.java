package structures;

import models.Student;

class Node {
    final Student data;
    Node next;

    Node(Student data) {
        this.data = data;
    }
    
    void setNext(Node node) {
        next = node;
    }
}
