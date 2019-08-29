class SingleDimensionArrayMain {
    public static void main(String args[]) {
        SingleDimensionArrayOperations sda = new SingleDimensionArrayOperations(10);

        // traversing the array
        sda.traverse();
        System.out.println();
        System.out.println();

        // inserting values into array
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);
        sda.insert(3, 40);
        sda.insert(4, 50);
        sda.insert(5, 60);
        sda.insert(6, 70);
        sda.insert(7, 90);
        sda.insert(1, 110);
        sda.insert(13, 140);

        System.out.println();
        System.out.println();

        // searching the array
        sda.search(90);
        sda.search(410);

        System.out.println();
        System.out.println();

        // deleting the value from specified index
        System.out.println("Array Before Deletion");
        sda.traverse();
        System.out.println("Array After Deletion");
        sda.delete(3);
        sda.delete(13);
        sda.traverse();
    }
}