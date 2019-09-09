package linkedList;

class SingleLinkedListOperations implements LinkedListOperationsInterface {

    LinkedList node;

    @Override
    public void insert(int valueToBeInserted, LinkedList head, int location) {
        
        node = new LinkedList(valueToBeInserted);
        if(headDoesExist(head)){
            System.out.println("Linked List Doesn't exist");
            return ;
        }
        head = node;

        


    }

    @Override
    public void traverse() {

    }

    @Override
    public void delete(int location, int head) {

    }

    @Override
    public void search(int keyToBeSearched, int head) {

    }

    @Override
    public void deleteEntireList() {

    }

    @Override
    public boolean headDoesExist(LinkedList head) {
        
        if(head == null){
            return true;
        }
        return false;
    }

    




}