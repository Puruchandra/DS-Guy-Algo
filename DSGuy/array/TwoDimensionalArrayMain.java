package array;

class TwoDimensionalArrayMain {

    public static void main(String[] args) {

        TwoDimensionalArrayOperations tao = new TwoDimensionalArrayOperations(3, 3);

        tao.traverse();
        System.out.println();
        System.out.println();

        tao.insert(10, 0, 0);
        tao.insert(20, 0, 1);
        tao.insert(30, 0, 2);
        tao.insert(40, 1, 0);
        tao.insert(50, 1, 1);
        tao.insert(60, 1, 2);
        tao.insert(60, 1, 3);
        tao.insert(70, 2, 0);

        System.out.println();
        System.out.println();

        tao.accessingCell(0, 2);
        tao.accessingCell(3, 3);
        tao.accessingCell(1, 2);

        System.out.println();
        System.out.println();

        tao.search(40);
        tao.search(90);
        tao.search(70);
        tao.search(10);

        System.out.println();
        System.out.println();

        System.out.println("Before deletion");
        tao.traverse();
        tao.delete(0,1);
        tao.delete(1,2);
        tao.delete(2,2);
        tao.delete(3,4);
        System.out.println("After deletion");
        tao.traverse();
    }
}