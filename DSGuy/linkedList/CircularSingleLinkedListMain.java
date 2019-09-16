package linkedList;

class CircularSingleLinkedListMain {
    public static void main(String[] args) {
        CircularSingleLinkedListOperations cslo = new CircularSingleLinkedListOperations();

        cslo.createLinkedList(10);
        cslo.traverse();

        cslo.insert(20, 0);
        cslo.traverse();
    }
}