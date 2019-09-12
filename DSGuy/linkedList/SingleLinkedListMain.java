package linkedList;

class SingleLinkedListMain {
    public static void main(String[] args) {
        
        SingleLinkedListOperations slo = new SingleLinkedListOperations();
        slo.createLinkedList(10);
        slo.insert(20, 0);
        slo.traverseList();

        System.out.println();
        System.out.println();

        slo.insert(20, 2);
        slo.traverseList();

    }
}