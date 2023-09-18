package recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        int index = 0;
        System.out.println(isSorted(arr, index));
    }

    static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);

    }
}
