package array;

class TwoDimensionalArrayOperations {

    int[][] array = null;

    TwoDimensionalArrayOperations(int rows, int noOfCols) {
        this.array = new int[rows][noOfCols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    void insert(int valueToBeInserted, int row, int col) {

        try {
            if (array[row][col] == Integer.MIN_VALUE) {
                array[row][col] = valueToBeInserted;
                System.out.println("value successfully inserted!");
            } else
                System.out.println("Index is occupied!");

        } catch (Exception e) {
            System.out.println("Index doesn't exists");
        }

    }

    void traverse() {
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.println(array[i][j]);
                }
                System.out.println("\n");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Index doesn't exists!");
        }
    }

    void delete(int valueToBeDeletedFromRow, int valueToBeDeletedFromCol) {

        try {
            array[valueToBeDeletedFromRow][valueToBeDeletedFromCol] = Integer.MIN_VALUE;
            System.out.println("Value deleted at row: " + valueToBeDeletedFromRow + " col: " + valueToBeDeletedFromCol);
        } catch (Exception e) {
            System.out.println("Index doesn't exist, hence can't be deleted!");
        }

    }

    void search(int valueToBeSearched) {
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] == valueToBeSearched) {
                        System.out.println("Value found at row: " + i + " col: " + j);
                        return;
                    }
                }
            }
            System.out.println("Value doesn't exists in array!");
        } catch (Exception e) {

        }
    }

    void accessingCell(int row, int col) {
        try {
            System.out.println("The value at row: " + row + " col: " + col + " is " + array[row][col]);
        } catch (Exception e) {
            System.out.println("Index doesn't exits");
        }
    }

}