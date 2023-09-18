package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9};
        int target = 9;
        int start = 0;
        int end = arr.length;
        System.out.println(search(arr,target,start,end));

    }
    static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
