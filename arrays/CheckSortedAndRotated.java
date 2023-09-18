package arrays;

public class CheckSortedAndRotated {

//    public static boolean checkIfSorted(int[] arr){
//
//    }
    public static boolean check(int[] nums) {
        int n = nums.length;

        // Find the pivot point (where rotation occurred)
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If there is no pivot, the array is already sorted
        if (pivot == -1) {
            return true;
        }

        // Check if the array is sorted in ascending order after the pivot
        for (int i = pivot + 1; i < n-1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        // Check if the array is sorted in ascending order before the pivot
        for (int i = 0; i < pivot; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        // If both checks pass, the array is sorted and rotated
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Is nums1 sorted and rotated? " + check(nums1)); // true

        int[] nums2 = {2,1,3,4};
        System.out.println("Is nums2 sorted and rotated? " + check(nums2)); // true

        int[] nums3 = {7, 6, 5, 4, 3, 2, 1};
        System.out.println("Is nums3 sorted and rotated? " + check(nums3)); // false
    }
}

