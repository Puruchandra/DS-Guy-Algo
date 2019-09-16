package linkedList;

import linkedList.node.SingleNode;

class CircularSingleLinkedListOperations {

    SingleNode head = null;
    SingleNode tail = null;
    int size;

    void createLinkedList(int nodeValue) {
        head = new SingleNode();
        tail = new SingleNode();
        SingleNode node = new SingleNode();
        node.setData(nodeValue);
        node.setNext(head);
        head = node;
        tail = node;
        size = 1;
    }

    void insert(int valueToBeInserted, int location) {
        if (headExists()) {
            System.out.println("LinkedList doesn't exist");
        } else if (location == 0) {
            SingleNode node = new SingleNode();
            node.setData(valueToBeInserted);

            node.setNext(head);
            head = node;
            tail.setNext(head);

            setSize(getSize() + 1);
        }

    }

    void delete(int location) {

    }

    void traverse() {
        System.out.println();
        SingleNode tempNode = head;
        for (int index = 0; index < getSize(); index++) {

            tempNode = tempNode.getNext();
            System.out.print(tempNode.getData());
            if (index < getSize() - 1)
                System.out.print("->");
        }
    }

    void search(int valueToBeSearched) {

    }

    void deleteEntireList() {
        head = null;
        tail = null;
    }

    boolean headExists() {
        if (head == null)
            return true;
        return false;
    }

    // getters and setters
    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}