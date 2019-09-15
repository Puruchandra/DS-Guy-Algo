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

        slo.insert(50, 0);
        slo.insert(40, 0);
        slo.traverseList();

        slo.searchLinkedList(40);

        slo.deleteFromLinkedList(0);
        slo.traverseList();

        slo.deleteFromLinkedList(0);
        slo.traverseList();

        slo.insert(40, 3);
        slo.insert(80, 0);
        slo.insert(70, 0);
        slo.insert(60, 0);
        slo.traverseList();

        slo.deleteFromLinkedList(2);
        System.out.println("after deletion");
        slo.traverseList();

        slo.deleteEntireList();
        System.out.println("traversing after deletion of entire list");
        slo.traverseList();
    }
}