package binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 20};
        int target = 4;
        System.out.println(ceiling(arr,34));
        System.out.println(floor(arr,0));


    }

    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[arr.length-1]){
                return -1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[0]){
                return -1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
