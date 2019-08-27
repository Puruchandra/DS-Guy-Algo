class BSTResusrsion {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 110, 120, 130 };
        int start = 0;
        int end = arr.length - 1;

        BST(140, arr, start, end);
    }

    public static void BST(int key, int[] arr, int start, int end) {
        if (start == end) {
            if (arr[start] == key) {
                System.out.println("found @: " + start);
                System.exit(0); // Have to exit the forcefully, else the system keeps on executing stack methods
            }

            else
                System.out.println("no such key exist");
            System.exit(0);

        }

        int mid = findMid(arr, start, end);

        if (arr[mid] > key) {
            BST(key, arr, start, mid - 1);
        }

        else if (arr[mid] < key) {
            BST(key, arr, mid + 1, end);
        }

        else if (arr[mid] == key) {
            System.out.println("Found @: " + mid);
        }

    }

    public static int findMid(int[] arr, int start, int end) {
        return (start + end) / 2;
    }
}