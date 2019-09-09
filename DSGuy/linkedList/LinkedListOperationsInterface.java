package linkedList;

interface LinkedListOperationsInterface {

    void insert(int valueToBeInserted, LinkedList head, int location);

    void traverse();

    void delete(int location, int head);

    void search(int keyToBeSearched, int head);

    void deleteEntireList();

    boolean headDoesExist(LinkedList head);
    

}