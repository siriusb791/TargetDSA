package arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(isArraySorted(arr,n));
    }

    private static boolean isArraySorted(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }





        }
        return true;
    }
}
