package love_babbar_2025.arrays;

import java.util.Arrays;

public class A07DutchNationalFlagAlgo {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid pointer
                mid++;
            } else {
                // Swap nums[mid] and nums[high]
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sortColors(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}


