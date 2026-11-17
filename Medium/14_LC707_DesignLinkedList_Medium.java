class MyLinkedList {

     class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
     }

     private Node head;
     private int size;

    public MyLinkedList() {
        head = new Node(0); // Dummy head
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node current = head.next;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head.next;
        head.next = newNode;

        size++;
        
    }
    
    public void addAtTail(int val) {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(val);

        current.next = newNode;

        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            index = 0;
        }

        if (index > size) {
            return;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node newNode = new Node(val);

        newNode.next = current.next;
        current.next = newNode;

        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
