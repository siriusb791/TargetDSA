package arrays;

import java.util.Arrays;

public class UniqueIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,5,5,6,7,7,7};
        System.out.println(uniqueIndex(arr).length);
        System.out.println(Arrays.toString(uniqueIndex(arr)));

    }

    static int[] uniqueIndex(int[] arr){
        if(arr.length==0){
            return new int[0];
        }
        int uniqueIndex = 0;
        
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return arr;

    }
}
