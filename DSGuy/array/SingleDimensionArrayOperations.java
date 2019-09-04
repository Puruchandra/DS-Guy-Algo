package array;

class SingleDimensionArrayOperations {

    int[] arr = null;

    SingleDimensionArrayOperations(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.MIN_VALUE;
    }

    // traverse the array
    void traverse() {
        try {
            for (int i = 0; i < arr.length; i++)
                System.out.println(arr[i]);
        } catch (Exception e) {
            System.out.println("Array No Longer Exists!");
        }
    }

    // insert values into array
    void insert(int index, int valueToBeInserted) {

        try {
            if (arr[index] != Integer.MIN_VALUE) {
                System.out.println("Index Occupied");
            } else
                arr[index] = valueToBeInserted;
            System.out.println("Successfully insterted " + valueToBeInserted + " at " + index);
        } catch (Exception e) {
            System.out.println("Index doesn't exist");
        }

    }

    // search any value in array
    void search(int valueToBeSearched) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToBeSearched) {
                System.out.println(valueToBeSearched + " is located at index " + i);
                return;
            }

        }
        System.out.println("Value Not Found!");
        return;
    }

    // delete value from array
    void delete(int valueToBeDeletedFromIndex) {
        try {
            arr[valueToBeDeletedFromIndex] = Integer.MIN_VALUE;
        } catch (Exception e) {
            System.out.println("Index doesn't Exist");
        }
    }

}
