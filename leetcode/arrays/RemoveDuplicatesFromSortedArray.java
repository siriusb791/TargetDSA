package leetcode.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Empty array, no duplicates to remove.
        }

        int uniqueIndex = 0; // Pointer to the last unique element.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Update the next unique element.
            }
        }

        // The unique elements are now stored at indices 0 to uniqueIndex (inclusive).
        // The length of the modified array is uniqueIndex + 1.
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5};

        int newLength = removeDuplicates(nums);
        System.out.println("New Length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

