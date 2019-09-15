package linkedList;

import linkedList.node.SingleNode;

class SingleLinkedListOperations {

    int size;
    SingleNode head = null;
    SingleNode tail = null;

    SingleNode createLinkedList(int nodeData) {
        head = new SingleNode();
        tail = new SingleNode();
        SingleNode node = new SingleNode();
        node.setData(nodeData);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    void insert(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setData(nodeValue);
        if (linkedListExists(head)) {
            System.out.println("Linked List Doesn't exist");
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
            // System.out.println("inserted at " + head + " :: " + node);
        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
            // System.out.println("inserted at " + head + " :: " + node + " :: " + tail);
        } else {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            SingleNode nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);

        }
        setSize(getSize() + 1);
    }

    void traverseList() {

        if (linkedListExists(head)) {
            return;
        }
        SingleNode tempNode = head;

        for (int i = 0; i < getSize(); i++) {
            System.out.print(tempNode.getData());
            if (i < getSize() - 1)
                System.out.print("->");
            tempNode = tempNode.getNext();
        }

        System.out.println();
    }

    boolean linkedListExists(SingleNode head) {
        if (head == null) {
            return true;
        }
        return false;
    }

    void searchLinkedList(int valueToBeSearched) {

        SingleNode tempNode = head;
        int index = 0;
        while (index < getSize()) {
            if (tempNode.getData() == valueToBeSearched) {
                System.out.println("Found!");
                return;
            }
            tempNode = tempNode.getNext();
            index++;

        }

    }

    void deleteFromLinkedList(int location) {
        SingleNode tempNode = head;

        if (linkedListExists(head)) {
            System.out.println("Linked List doesn't exist");
        }

        if (location == 0) {
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.getNext();
            if(getSize()==0){
                tail=null;
            }
            setSize(getSize() - 1);
        }

        else if (location >= getSize()) {
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            int index = 0;
            while (index < getSize() - 1) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            setSize(getSize() - 1);

        } else {
            SingleNode tempNode1 = head;
            int index = 0;
            while (index < location) {
                tempNode1 = tempNode1.getNext();
                index++;
            }
            tempNode1.setNext(tempNode1.getNext().getNext());
            setSize(getSize() - 1);
        }
    }

    void deleteEntireList() {
        head = null;
        tail = null;
    }

    // getters and setters..

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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
}