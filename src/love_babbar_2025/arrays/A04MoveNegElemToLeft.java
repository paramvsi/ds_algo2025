package love_babbar_2025.arrays;

import java.util.Arrays;

public class A04MoveNegElemToLeft {

    public static void moveNegativesToFront(int[] arr) {
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap negative element to the left partition
                swap(arr, left, i);
                left++;
            }
        }
    }

    public static void moveNegativesToFrontDay2(int[] arr){
        int left = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                swap(arr, left, i);
                left++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4, -6, 7};
        int[] arr2 = {1, 2, -3, 4, 1, -5, -6, -7};
        moveNegativesToFront(arr);
        moveNegativesToFrontDay2(arr2);
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
        System.out.println("Rearranged Array: " + Arrays.toString(arr2));
    }
}
