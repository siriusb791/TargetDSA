package arrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5,6,7};
        int[] merged = mergeArrays(arr1,arr2);
        for (int nums:merged
             ) {
            System.out.print(" "+nums+" ");
        }
        merge1(arr1, arr2, arr1.length, arr2.length);
        merge2(arr1, arr1.length, arr2, arr2.length);

    }
    static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int[] mergedArray = new int[m+n];

        int left = 0;
        int right = 0;
        int index = 0;


        while(left < nums1.length && right < nums2.length){
            if(nums1[left] <= nums2[right]){
                mergedArray[index] = nums1[left];
                left++;
                index++;
            }else{
                mergedArray[index] = nums2[right];
                right++;
                index++;
            }

        }

        while(left < nums1.length){
            mergedArray[index] = nums1[left];
            left++;
            index++;
        }
        while(right < nums2.length){
            mergedArray[index] =  nums2[right];
            right++;
            index++;
        }

        System.out.println(Arrays.toString(mergedArray));

    }
    static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] mix = new int[arr1.length+ arr2.length];
        int i= 0;
        int j= 0;
        int k = 0;
        while(i< arr1.length&&j< arr2.length){
            if(arr1[i]<arr2[j]){
                mix[k] = arr1[i];
                i++;
            }else{
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i< arr1.length){
            mix[k] = arr1[i];
            i++;
            k++;
        }
        while(j< arr1.length){
            mix[k] = arr2[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void merge1(int[] arr1, int[] arr2, int n, int m) {

        // Declare a 3rd array and 2 pointers:
        int[] arr3 = new int[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;

            } else {
                arr3[index] = arr2[right];
                right++;

            }
            index++;
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        System.out.println(Arrays.toString(arr3));

        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
//        for (int i = 0; i < n + m; i++) {
//            if (i < n) {
//                arr1[i] = arr3[i];
//            } else {
//                arr2[i - n] = arr3[i];
//            }
//        }
    }


    static void merge(int[] num1, int m, int[] num2, int n) {

        int[] mergedArray = new int[m+n];

        int left = 0;
        int right = 0;
        int index = 0;


        while(left < num1.length || right < num2.length){
            if(num1[left] < num2[right]){
                mergedArray[index] = num1[left];
                left++;
                index++;
            }
            if(num2[right] < num1[left]){
                mergedArray[index] = num2[right];
                right++;
                index++;
            }
            if(num1[left]==num2[right]){
                mergedArray[index] = num1[left];
                left++;
                index++;

            }


        }

        while(left < num1.length){
            mergedArray[index] = num1[left];
            left++;
            index++;
        }
        while(right < num2.length){
            mergedArray[index] =  num2[right];
            right++;
            index++;
        }

        for(int nums : mergedArray){
            System.out.print(nums);
        }

    }
}
