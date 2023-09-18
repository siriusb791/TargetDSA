package searching;

public class BinarySearching {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,76};
        int n = arr.length;
        int target = 4;
        System.out.println(findN(arr,n,target));
    }

    private static int findN(int[] arr, int n, int target) {

        int start = 0;
        int end = n-1;


        while(start > end){
            int mid = (start +end)/2;

        }


        return start;
    }
}
